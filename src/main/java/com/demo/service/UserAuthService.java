package com.demo.service;

import com.demo.model.Response;
import com.demo.model.User;

public interface UserAuthService {

    Response authenticateUser(String username, String password);
}
