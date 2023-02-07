package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Customer;

public interface Customer_Repo extends JpaRepository<Customer,Integer>{

}
