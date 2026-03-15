package com.felipebrito.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipebrito.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
