package com.caglardurmaz.readingisgood.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Book {

    private Long id;
    private String name;

}
