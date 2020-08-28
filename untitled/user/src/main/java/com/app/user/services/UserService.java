package com.app.user.services;

import com.app.user.models.UserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {

    public void addUser(UserDTO userDTO);

    public void editUser(UserDTO userDTO);

    public UserDTO getUser(String Id);

    public ArrayList<UserDTO> getAllUser();

    public void deleteUser(UserDTO Id);
}
