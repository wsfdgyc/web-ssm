package com.heitian.ssm.mapper;

import com.heitian.ssm.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User check(String userName, String userPWD);

    void add(User user);

    User find(String userName);
}
