package com.ricky.codelab.jersey.service.impl;

import com.ricky.codelab.jersey.domain.User;
import com.ricky.codelab.jersey.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-20 14:30
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    public User findUserById(long id) {
        User user = new User();
        user.setId(id);
        user.setName("ricky");
        user.setAge(27);

        return user;
    }
}
