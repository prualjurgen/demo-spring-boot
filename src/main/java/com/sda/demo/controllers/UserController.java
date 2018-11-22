package com.sda.demo.controllers;

import com.sda.demo.dto.User;
import com.sda.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/users")

public class UserController {


    @Autowired
    UserRepository userRepository;


    @RequestMapping(method = RequestMethod.GET, path = "/all")
    public Iterable<User> GetAllUsers() {
        return userRepository.findAll();
    }


    @RequestMapping(method = RequestMethod.GET, path = "/allByName")
    public Iterable<User> getAllUserByName(@PathParam("name") String name) {
        return userRepository.findAllByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public void AddNewUser(@RequestBody User user) {
        userRepository.save(user);

    }

    @RequestMapping(method = RequestMethod.POST, path = "/aifaojg")
    public void LoginNewUser(@RequestBody User user) {
        userRepository.save(user);
    }
}