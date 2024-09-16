package com.bluebarry.OnlineLearningManagementSystem.repositories;

import com.bluebarry.OnlineLearningManagementSystem.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepo extends JpaRepository<Option,Long> {
}
