package com.nonato.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nonato.cursojava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{	

}
