package com.app.user.controllers;

import com.app.user.models.UserDTO;
import com.app.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class UserServiceControllers {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{userId}")
    public String getUser(@PathVariable String userId) {
        userService.getUser(userId);
        return "hello";
    }

    @GetMapping(value = "/user")
    public ArrayList<UserDTO> getUser() {

        return userService.getAllUser();
    }

    @PostMapping(value = "/user/new")
    public void newUser(@RequestBody UserDTO body) {
        userService.addUser(body);
        System.out.println(body.toString());
    }

    @PostMapping(value = "/user/edit")
    public void editUser(@RequestBody UserDTO body) {
        userService.editUser(body);
    }

    @PostMapping(value = "/user/delete")
    public void deleteUser(@RequestBody UserDTO body) {
        userService.deleteUser(body);
    }

}
