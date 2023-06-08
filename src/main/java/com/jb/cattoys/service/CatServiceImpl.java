package com.jb.cattoys.service;

import com.jb.cattoys.beans.Cat;
import com.jb.cattoys.exceptions.CatSystemExp;
import com.jb.cattoys.exceptions.MsgExcep;
import com.jb.cattoys.repos.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatServiceImpl implements CatService {
    @Autowired
    private CatRepository catRepository;


    @Override
    public void addCat(Cat cat) throws CatSystemExp {
        catRepository.save(cat);
    }

    @Override
    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    @Override
    public void updateCat(int catId, Cat cat) throws CatSystemExp {
        if (!catRepository.existsById(catId)) {
            throw new CatSystemExp(MsgExcep.ID_NOT_EXISTS);
        }
        if (cat.getId() != catId) {
            throw new CatSystemExp(MsgExcep.ID_NOT_MATCH);
        }
        catRepository.saveAndFlush(cat);
    }

    @Override
    public Optional<Cat> getSingleCat(int catId) {//throws CatSystemExp {
        return catRepository.findById(catId);//.orElseThrow(()->new CatSystemExp(MsgExcep.ID_NOT_EXISTS));
    }

    @Override
    public List<Cat> getCatsByNameAndWeight(String name, double weight) {
        return catRepository.findByNameAndWeight(name,weight);
    }

    @Override
    public List<Cat> getCatsByNameOrWeight(String name, double weight) throws CatSystemExp {
        if(weight<=0){
            throw  new CatSystemExp(MsgExcep.WEIGHT_NOT_GOOD);
        }
        return catRepository.findByNameOrWeight(name,weight);
    }

    @Override
    public List<Cat> getCatsByAscendingWeight() {
        return catRepository.findByOrderByWeightAsc();
    }
//
    @Override
    public List<Cat> getCatsByDescendingWeight() {
        return catRepository.findByOrderByWeightDesc();
    }

    @Override
    public double getAvgWeightAllCats() {
        return catRepository.averageWeight();
    }
}
