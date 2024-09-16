package com.bluebarry.OnlineLearningManagementSystem.entities;

import com.bluebarry.OnlineLearningManagementSystem.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;  //  INSTRUCTOR, STUDENT

    private String profilePicture;

    private String bio;

}
