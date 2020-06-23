package com.demo.service.impl;

import com.demo.model.Response;
import com.demo.repository.UserRepository;
import com.demo.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthServiceImpl implements UserAuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Response authenticateUser(String username, String password) {
        if (userRepository.checkIfUserExists(username) != 1) {
            return new Response(401, "Username Not Found");
        } else if (userRepository.checkIfPasswordMatch(username, password) != 1) {
            return new Response(402, "Username and Password Does Not Match");
        }

        return new Response(200, "User Authentication Success!");
    }
}
