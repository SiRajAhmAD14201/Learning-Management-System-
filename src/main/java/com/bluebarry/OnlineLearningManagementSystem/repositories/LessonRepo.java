package com.bluebarry.OnlineLearningManagementSystem.repositories;

import com.bluebarry.OnlineLearningManagementSystem.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepo extends JpaRepository<Lesson,Long> {
}
