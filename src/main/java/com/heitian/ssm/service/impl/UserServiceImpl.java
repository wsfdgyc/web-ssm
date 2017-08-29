package com.heitian.ssm.service.impl;

import com.heitian.ssm.mapper.UserMapper;
import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public void registerUser(User user)   {
        if (userMapper.find(user.getUserName()) == null) {
            userMapper.add(user);
        }
    }

    public User loginUser(String userName, String userPwd) {
        return userMapper.check(userName,userPwd);
    }
}
