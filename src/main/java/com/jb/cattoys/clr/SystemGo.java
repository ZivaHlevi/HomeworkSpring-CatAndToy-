package com.jb.cattoys.clr;

import com.jb.cattoys.beans.Cat;
import com.jb.cattoys.beans.Color;
import com.jb.cattoys.beans.Toy;
import com.jb.cattoys.repos.CatRepository;
import com.jb.cattoys.repos.ToyRepository;

import com.jb.cattoys.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
public class SystemGo implements CommandLineRunner {
    @Autowired
    private CatRepository catRepository;
    @Autowired
    private ToyRepository toyRepository;
    @Autowired
    private CatService catService;

    @Override
    public void run(String... args) throws Exception {
        Toy toy1= new Toy("Toy1");
        Toy toy2= new Toy("Toy2");
        Toy toy3= new Toy("Toy3");
        Toy toy4= new Toy("Toy4");
        Cat cat1 = Cat.builder().name("Cat1").color(Color.BLACK).weight(5.35).toys(List.of(toy1,toy3)).build();
        Cat cat2 = Cat.builder().name("Cat2").color(Color.WHITE).weight(7.35).toys(List.of(toy2)).build();

        toy1.setCat(cat1);
        toy2.setCat(cat2);
       // toy2.setCat(cat1);
        toy3.setCat(cat1);
       // toy3.setCat(cat3);
//
        catService.addCat(cat1);
       catService.addCat(cat2);

        Cat cat3= Cat.builder().name("Cat3").color(Color.YELLOW).weight(9.35).toys(List.of(toy4)).build();
        toy4.setCat(cat3);
        catService.addCat(cat3);
//        catService.addCat(cat3);


//        catRepository.saveAll(List.of(cat1,cat2,cat3));
//        catRepository.delete(catRepository.getReferenceById(2));
//        catRepository.save(cat2);
       catRepository.findAll().forEach(System.out::println);

    }
}
