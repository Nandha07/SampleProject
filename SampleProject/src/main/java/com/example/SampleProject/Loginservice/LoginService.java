package com.example.SampleProject.Loginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SampleProject.Logindomain.Login;
import com.example.SampleProject.Loginrepository.Loginrepository;
@Service
public class LoginService {
    
    @Autowired
    private Loginrepository repo;
  
  public Login login(String username, String password) {
      Login user = repo.findByUsernameAndPassword(username, password);
      return user;
  }
    
}