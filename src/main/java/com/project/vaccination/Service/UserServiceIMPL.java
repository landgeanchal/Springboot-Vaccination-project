package com.project.vaccination.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.vaccination.model.User;
import com.project.vaccination.repository.UserRepo;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    UserRepo exp;

    @Override
    public void addUser(User user) {
        exp.save(user);
    }

   
}
