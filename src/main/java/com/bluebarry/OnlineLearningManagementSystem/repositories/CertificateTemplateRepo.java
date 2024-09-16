package com.bluebarry.OnlineLearningManagementSystem.repositories;

import com.bluebarry.OnlineLearningManagementSystem.entities.CertificateTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateTemplateRepo extends JpaRepository<CertificateTemplate,Long> {
}
