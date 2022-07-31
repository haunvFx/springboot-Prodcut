package com.example.springboot.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.springboot.module.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Integer>{

	Product findByName(String name);

}
