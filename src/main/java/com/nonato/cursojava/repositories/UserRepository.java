package com.nonato.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nonato.cursojava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
