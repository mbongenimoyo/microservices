package com.app.user.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class UserDTO {

    @GeneratedValue
    @Id
    public long id;

    public String userName;
    public String firstName;
    public String lastName;
    public String email;
    public String address;
    private String type;
    //CREATE INDEX OF BOOKINGS THIS USER HAS
    //private List<> bookings = new List<>();


    public UserDTO() {

    }

}
