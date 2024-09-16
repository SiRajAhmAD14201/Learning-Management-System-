package com.bluebarry.OnlineLearningManagementSystem.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "instructor")
public class Instructor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;  // Reference to the User entity
    @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL)
    private List<Course> courses;

    // Getters and Setters
}

