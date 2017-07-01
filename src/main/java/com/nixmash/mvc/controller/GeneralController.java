package com.nixmash.mvc.controller;

import com.nixmash.mvc.model.User;
import com.nixmash.mvc.views.PageView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by daveburke on 6/26/17.
 */
@Path("/")
public class GeneralController {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello() {
        return "hello!";
    }

    @GET
    public PageView home() {
        User user = new User("Bob", "password", "Bob McCall");
        return new PageView("home.mustache", user);
    }

}
