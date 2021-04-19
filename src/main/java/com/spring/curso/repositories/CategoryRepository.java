package com.spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.curso.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
