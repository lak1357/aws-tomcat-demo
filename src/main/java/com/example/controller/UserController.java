package com.example.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Response;
import com.example.pojo.User;


@RestController
public class UserController 
{
	
    @RequestMapping(method=RequestMethod.GET, path = "/users")
    public ResponseEntity<Response> getUsers()
    {
        List<User> users = new ArrayList<>();
        
        User u1 = new User();
        u1.setId(1l);
        u1.setName("User 1 Lakshitha");
        u1.setUsername("lakshitha");
        u1.setAddress("Colombo 06");
        
        
        User u2 = new User();
        u2.setId(1l);
        u2.setName("User 2 Prageeth");
        u2.setUsername("prageeth");
        u2.setAddress("Matale");
        
        
        users.add(u1);
        users.add(u2);
        Response r = new Response(true, users);
        return new ResponseEntity<Response>(r,HttpStatus.OK);
    }	
	
}