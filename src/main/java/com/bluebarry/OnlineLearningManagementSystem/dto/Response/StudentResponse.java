package com.bluebarry.OnlineLearningManagementSystem.dto.Response;

import lombok.Data;

import java.util.List;

@Data
public class StudentResponse {
    private Long id;
    private Long userId;
    private List<EnrollmentResponse> enrollments;
    private List<CertificateResponse> certificates;
}
