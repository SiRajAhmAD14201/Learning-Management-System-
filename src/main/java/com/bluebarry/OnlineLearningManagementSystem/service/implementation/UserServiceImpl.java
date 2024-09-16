package com.bluebarry.OnlineLearningManagementSystem.service.implementation;

import com.bluebarry.OnlineLearningManagementSystem.dto.Request.UserRequest;
import com.bluebarry.OnlineLearningManagementSystem.dto.Response.UserResponse;
import com.bluebarry.OnlineLearningManagementSystem.entities.User;
import com.bluebarry.OnlineLearningManagementSystem.repositories.UserRepo;
import com.bluebarry.OnlineLearningManagementSystem.service.interfaces.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private  final UserRepo userRepo;
    private final ModelMapper modelMapper;
    @Autowired
    public UserServiceImpl(UserRepo userRepo, ModelMapper modelMapper) {
        this.userRepo = userRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<UserResponse> getAllUser() {
        List<User> users = userRepo.findAll();
        return users.stream().map(user->modelMapper.map(user,UserResponse.class)).collect(Collectors.toList());
//      return userRepo.findAll().stream().map(this::converttoUserEntity).collect(Collectors.toList());
    }

    @Override
    public UserResponse getUserById(Long id) {
        User user=userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return modelMapper.map(user,UserResponse.class);
    }

    @Override
    public UserResponse saveUser(UserRequest userRequest) {
        // Map UserRequest DTO to User entity
        User user = modelMapper.map(userRequest, User.class);

        // Save the user in the database
        User savedUser = userRepo.save(user);

        // Map the saved User entity to UserResponse and return it
        return modelMapper.map(savedUser, UserResponse.class);
    }

    @Override
    public UserResponse updateUser(UserRequest userRequest, Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
