package com.ricky.codelab.jersey.service;

import com.ricky.codelab.jersey.domain.User;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-20 14:30
 */
public interface IUserService {

    User findUserById(long id);
}
