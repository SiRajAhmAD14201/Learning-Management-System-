package com.bluebarry.OnlineLearningManagementSystem.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="quizzes")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> questions;

    private Double totalMarks;

    @OneToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}
