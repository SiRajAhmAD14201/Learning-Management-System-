package com.bluebarry.OnlineLearningManagementSystem.service.interfaces;

import com.bluebarry.OnlineLearningManagementSystem.dto.Request.UserRequest;
import com.bluebarry.OnlineLearningManagementSystem.dto.Response.UserResponse;

import java.util.List;

public interface UserService {
   List<UserResponse> getAllUser();
   UserResponse getUserById(Long id);
   UserResponse saveUser(UserRequest userRequest);
   UserResponse updateUser(UserRequest userRequest, Long id);
   void deleteUser(Long id);
}
