package com.koh.springbootone.service;

import com.koh.springbootone.model.Quiz;
import com.koh.springbootone.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Oleksandr Kokhaniuk
 * @created 4/20/2022, 8:04 PM
 */

@Service
public class QuizServise {
    private final QuizRepository quizRepository;

    @Autowired
    public QuizServise(QuizRepository quizRepository){
        this.quizRepository=quizRepository;
    }

    public Quiz findById(Long id){
        return quizRepository.findById(id).orElse(null);
    }

    public List<Quiz> findAll(){
        return quizRepository.findAll();
    }


}
