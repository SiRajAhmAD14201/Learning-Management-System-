package com.bluebarry.OnlineLearningManagementSystem.repositories;

import com.bluebarry.OnlineLearningManagementSystem.entities.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepo extends JpaRepository<Certificate,Long> {
}
