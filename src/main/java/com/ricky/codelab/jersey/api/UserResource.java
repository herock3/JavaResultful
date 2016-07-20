package com.ricky.codelab.jersey.api;

import com.ricky.codelab.jersey.domain.User;
import com.ricky.codelab.jersey.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-20 14:28
 */
@Component
@Path("/user")
public class UserResource {

    @Autowired
    private IUserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(long id) {

        return userService.findUserById(id);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
