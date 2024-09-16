package com.bluebarry.OnlineLearningManagementSystem.dto.Response;

import lombok.Data;

@Data
public class CertificateTemplateResponse {
    private Long id;
    private String templateName;
    private String templateFile;
    private Long courseId;
}
