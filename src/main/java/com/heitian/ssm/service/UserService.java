package com.heitian.ssm.service;

import com.heitian.ssm.model.User;
import org.omg.CORBA.UserException;

public interface UserService {
    void registerUser(User user);

    User loginUser(String userName, String userPwd);
}
