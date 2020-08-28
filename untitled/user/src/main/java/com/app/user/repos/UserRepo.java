package com.app.user.repos;

import com.app.user.models.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserDTO, Long> {

    //public boolean findbyEmail();

    //public boolean findbyUsername();
}
