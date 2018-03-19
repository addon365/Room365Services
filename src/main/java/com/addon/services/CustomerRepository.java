package com.addon.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addon.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
