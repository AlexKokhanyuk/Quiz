package com.koh.springbootone.repository;

import com.koh.springbootone.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Oleksandr Kokhaniuk
 * @created 4/20/2022, 7:53 PM
 */
public interface QuizRepository extends JpaRepository<Quiz,Long> {
}
