package com.spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
