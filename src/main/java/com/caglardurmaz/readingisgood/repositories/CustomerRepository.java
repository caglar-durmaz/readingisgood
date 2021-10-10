package com.caglardurmaz.readingisgood.repositories;

import com.caglardurmaz.readingisgood.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE c.userName = ?1 AND c.password = ?2")
    List<Customer> getUserName(String userName, String password);
}
