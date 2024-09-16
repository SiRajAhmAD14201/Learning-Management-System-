package com.bluebarry.OnlineLearningManagementSystem.dto.Response;

import com.bluebarry.OnlineLearningManagementSystem.entities.enums.Role;
import lombok.Data;

@Data
public class UserResponse {
    private Long id;
    private String username;
    private String email;
    private Role role;  //  INSTRUCTOR, STUDENT
    private String profilePicture;

    private String bio;
}
