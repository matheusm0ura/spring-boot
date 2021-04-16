package com.spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
