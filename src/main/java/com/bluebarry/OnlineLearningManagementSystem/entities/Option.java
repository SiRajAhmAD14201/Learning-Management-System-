package com.bluebarry.OnlineLearningManagementSystem.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="options")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String optionText;

    private Boolean isCorrect;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
}
