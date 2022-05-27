package com.tkarov.gatewayairlines.service.impl;

import com.tkarov.gatewayairlines.model.response.UserResponseBody;
import com.tkarov.gatewayairlines.persistence.repository.UserRepository;
import com.tkarov.gatewayairlines.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserResponseBody> listUsers() {
        return null;
    }

    @Override
    public UserResponseBody updateUser() {
        return null;
    }

    @Override
    public UserResponseBody updateVaccineStatus() {
        return null;
    }

    @Override
    public UserResponseBody findUser() {
        return null;
    }

    @Override
    public void deleteUser() {

    }

    @Override
    public UserResponseBody createUser() {
        return null;
    }
}
