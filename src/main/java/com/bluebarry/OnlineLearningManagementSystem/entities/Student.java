package com.bluebarry.OnlineLearningManagementSystem.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany
    @JoinColumn(name = "enrollment_id")
    private List<Enrollment> enrollments;
    @OneToMany
    @JoinColumn(name = "certificate_id")
    private List<Certificate> certificates;
}
