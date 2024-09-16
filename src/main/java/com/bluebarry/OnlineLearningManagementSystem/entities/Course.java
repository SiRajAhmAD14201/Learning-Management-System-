package com.bluebarry.OnlineLearningManagementSystem.entities;

import com.bluebarry.OnlineLearningManagementSystem.entities.enums.DifficultyLevel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficultyLevel;  // BEGINNER, INTERMEDIATE, ADVANCED

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Lesson> lessons;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Review> reviews;

    @ManyToMany
    @JoinTable(
            name = "course_enrolled_students",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> enrolledStudents;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "certificate_template_id", referencedColumnName = "id")
    private CertificateTemplate certificateTemplate;
}
