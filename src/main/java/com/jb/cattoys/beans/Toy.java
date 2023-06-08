package com.jb.cattoys.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Toy {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ToString.Exclude
    @ManyToOne
    private Cat cat;

    public Toy(String name) {
        this.name = name;
    }
}
