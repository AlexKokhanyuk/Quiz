package com.koh.springbootone.repository;

import com.koh.springbootone.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findAllByQuizId(Long id);
}
