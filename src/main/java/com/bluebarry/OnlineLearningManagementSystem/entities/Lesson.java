package com.bluebarry.OnlineLearningManagementSystem.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @OneToOne(mappedBy = "lesson", cascade = CascadeType.ALL)
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
