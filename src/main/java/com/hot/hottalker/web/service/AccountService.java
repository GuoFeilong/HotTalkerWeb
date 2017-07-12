package com.hot.hottalker.web.service;

import com.hot.hottalker.web.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;

/**
 * @author by user on 17/7/12.
 */
public class AccountService {
    @GET
    @Path("/login")
    public String getLogin() {
        return "You get login get";
    }


    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User postLogin() {
        return new User("测试", 2);
    }

}
