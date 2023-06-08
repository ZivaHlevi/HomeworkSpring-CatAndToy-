package com.jb.cattoys.controllers;

import com.jb.cattoys.beans.Cat;
import com.jb.cattoys.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/cat")
public class CatController {
    @Autowired
    private CatService catService;

    @GetMapping
    public List<Cat> getAllCats(){
        return catService.getAllCats();
    }

}
