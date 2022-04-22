package com.koh.springbootone.repository;

import com.koh.springbootone.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer,Long> {
    List<Answer> findByQuestionsId(Long id);
}
