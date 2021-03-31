package com.devsuperior.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	 

}
