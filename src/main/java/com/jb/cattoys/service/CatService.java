package com.jb.cattoys.service;

import com.jb.cattoys.beans.Cat;
import com.jb.cattoys.exceptions.CatSystemExp;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface CatService {
    void addCat(Cat cat) throws CatSystemExp;
    List<Cat> getAllCats();
    void updateCat(int catId,Cat cat) throws CatSystemExp;
    Optional <Cat> getSingleCat (int catId) throws CatSystemExp;
    List<Cat> getCatsByNameAndWeight(String name, double weight);
    List<Cat> getCatsByNameOrWeight(String name, double weight) throws CatSystemExp;
    List<Cat> getCatsByAscendingWeight();
    List<Cat> getCatsByDescendingWeight();
    double getAvgWeightAllCats();




}

