package com.nonato.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nonato.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{	

}
