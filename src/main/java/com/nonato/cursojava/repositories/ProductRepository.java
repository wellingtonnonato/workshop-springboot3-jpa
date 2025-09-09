package com.nonato.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nonato.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{	

}
