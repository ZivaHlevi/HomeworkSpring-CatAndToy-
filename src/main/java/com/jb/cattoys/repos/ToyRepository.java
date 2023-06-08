package com.jb.cattoys.repos;

import com.jb.cattoys.beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToyRepository extends JpaRepository<Toy,Integer> {
    boolean existsByName(String name);

}
