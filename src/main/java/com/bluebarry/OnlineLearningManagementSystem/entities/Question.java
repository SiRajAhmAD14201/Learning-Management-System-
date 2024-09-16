package com.bluebarry.OnlineLearningManagementSystem.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Option> options;

    @OneToOne
    @JoinColumn(name = "correct_option_id")
    private Option correctOption;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
}
