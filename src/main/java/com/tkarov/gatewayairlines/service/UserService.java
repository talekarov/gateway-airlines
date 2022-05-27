package com.tkarov.gatewayairlines.service;

import com.tkarov.gatewayairlines.model.response.UserResponseBody;

import java.util.List;

public interface UserService {

    List<UserResponseBody> listUsers();

    UserResponseBody updateUser();

    UserResponseBody updateVaccineStatus();

    UserResponseBody findUser();

    void deleteUser();

    UserResponseBody createUser();
}
