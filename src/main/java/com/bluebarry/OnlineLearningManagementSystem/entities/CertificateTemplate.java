package com.bluebarry.OnlineLearningManagementSystem.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "certificateTemplates")
public class CertificateTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String templateName;
    private String templateFile;
    @OneToOne(mappedBy = "certificateTemplate")
    private Course course;
}
