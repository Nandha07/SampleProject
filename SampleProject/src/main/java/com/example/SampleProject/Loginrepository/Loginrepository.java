package com.example.SampleProject.Loginrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SampleProject.Logindomain.Login;

@Repository
public interface Loginrepository extends JpaRepository<Login, Long>{
    Login findByUsernameAndPassword(String username, String password);
}