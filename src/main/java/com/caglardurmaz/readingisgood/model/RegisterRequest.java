package com.caglardurmaz.readingisgood.model;

import lombok.Data;

@Data
public class RegisterRequest {
    private String name;
    private String userName;
    private String password;
}
