package com.jb.cattoys.service;

import com.jb.cattoys.beans.Cat;
import com.jb.cattoys.exceptions.CatSystemExp;
import com.jb.cattoys.exceptions.MsgExcep;
import com.jb.cattoys.repos.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatServiceImpl implements CatService {
    @Autowired
    private CatRepository catRepository;


    @Override
    public void addCat(Cat cat) throws CatSystemExp {
        catRepository.save(cat);
    }
}
