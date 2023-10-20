package com.project.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.vaccination.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

    
    
}
