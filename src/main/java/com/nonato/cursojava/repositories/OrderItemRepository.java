package com.nonato.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nonato.cursojava.entities.OrderItem;
import com.nonato.cursojava.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{	

}
