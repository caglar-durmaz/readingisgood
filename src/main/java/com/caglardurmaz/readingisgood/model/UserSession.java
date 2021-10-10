package com.caglardurmaz.readingisgood.model;

import com.caglardurmaz.readingisgood.domain.Customer;
import lombok.Data;

@Data
public class UserSession {
    private String sessionId;
    private Customer customer;
}
