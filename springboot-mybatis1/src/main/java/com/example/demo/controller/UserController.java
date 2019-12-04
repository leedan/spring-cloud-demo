package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUser/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable int id) {
        return userService.getUser(id).toString();
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.GET)
    @ResponseBody
    public String updateUser(int id, String userName){
        userService.updateUser(id,userName);

        return "Success";
    }
}
