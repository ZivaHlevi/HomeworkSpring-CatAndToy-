package com.jb.cattoys.service;

import com.jb.cattoys.beans.Cat;
import com.jb.cattoys.exceptions.CatSystemExp;
import org.springframework.stereotype.Service;

@Service

public interface CatService {
    void addCat(Cat cat) throws CatSystemExp;
}

