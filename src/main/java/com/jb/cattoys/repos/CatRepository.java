package com.jb.cattoys.repos;

import com.jb.cattoys.beans.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends JpaRepository<Cat,Integer> {
    List<Cat> findByNameAndWeight(String name,double weight);
    List<Cat> findByNameOrWeight(String name,double weight);
    List<Cat> findByOrderByWeightAsc();
    List<Cat> findByOrderByWeightDesc();

    @Query(value = "SELECT AVG(weight) FROM try3cat_toys.cat",nativeQuery = true)
    double averageWeight();
}
