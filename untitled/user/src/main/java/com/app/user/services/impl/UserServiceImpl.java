package com.app.user.services.impl;

import com.app.user.models.UserDTO;
import com.app.user.repos.UserRepo;
import com.app.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    public boolean verifyEmail(String email) {
        //TO DO
        long o = 0;
        if (userRepo.findById(o).isPresent()) {
            return true;
        }
        return false;
    }

    public boolean verifyUsername(String userName) {
        //TO DO
        long o = 0;
        if (userRepo.findById(o).isPresent()) {
            return true;
        }
        return false;
    }

    @Override
    public void addUser(UserDTO userDTO) {
//        String data="";
//        if(verifyEmail(userDTO.email)){
//            System.out.println("email already taken ");
//            data+="email error";
//        }
//        if(verifyUsername( userDTO.userName)){
//            System.out.println("email already taken ");
//            data+="username error";
//        }
        userRepo.save(userDTO);
        //return error if theres errors

    }

    @Override
    public void editUser(UserDTO userDTO) {

    }

    @Override
    public UserDTO getUser(String Id) {
        long id = 1;
        //TO DO : create database query for finding user by userID
        userRepo.findById(id);

        return null;
    }

    @Override
    public ArrayList<UserDTO> getAllUser() {
        return (ArrayList<UserDTO>) userRepo.findAll();
    }

    @Override
    public void deleteUser(UserDTO userDTO) {
        userRepo.delete(userDTO);
    }

}
