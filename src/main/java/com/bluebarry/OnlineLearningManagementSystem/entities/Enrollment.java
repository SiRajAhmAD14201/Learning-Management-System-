package com.bluebarry.OnlineLearningManagementSystem.entities;

import com.bluebarry.OnlineLearningManagementSystem.entities.enums.EnrollmentStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private Double progress;

    @Temporal(TemporalType.DATE)
    private Date dateEnrolled;

    @Enumerated(EnumType.STRING)
    private EnrollmentStatus status;  // ACTIVE, COMPLETED, PENDING
}
