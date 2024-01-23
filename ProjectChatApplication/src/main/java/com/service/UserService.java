package com.service;



import java.util.List;

import com.exceptions.UserAlreadyExistException;
import com.exceptions.UserNotFoundException;
import com.model.User;

public interface UserService {
    List<User> getall() throws UserNotFoundException;

    User addUser(User user) throws UserAlreadyExistException;

    User getUserByUserName(String username)  throws UserNotFoundException;
}
