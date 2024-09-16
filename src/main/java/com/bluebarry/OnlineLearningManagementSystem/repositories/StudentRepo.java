package com.bluebarry.OnlineLearningManagementSystem.repositories;

import com.bluebarry.OnlineLearningManagementSystem.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
}
