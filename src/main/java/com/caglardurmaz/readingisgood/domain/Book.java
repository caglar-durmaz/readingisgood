package com.caglardurmaz.readingisgood.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToMany(mappedBy = "customers")
    private Set<Customer> customers = new HashSet<>();

    @Id
    public Long getId() {
        return id;
    }
}
