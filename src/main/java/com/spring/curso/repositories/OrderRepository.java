package com.spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
