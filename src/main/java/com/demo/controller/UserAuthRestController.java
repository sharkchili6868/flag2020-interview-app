package com.demo.controller;

import com.demo.model.Response;
import com.demo.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserAuthRestController {

    @Autowired
    private UserAuthService userAuthService;

    @PostMapping("/auth")
    public Response authenticateUser(@RequestParam String username, @RequestParam String password) {
        return userAuthService.authenticateUser(username, password);
    }
}
