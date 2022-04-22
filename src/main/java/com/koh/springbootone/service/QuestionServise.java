package com.koh.springbootone.service;

import com.koh.springbootone.model.Answer;
import com.koh.springbootone.model.Question;
import com.koh.springbootone.repository.AnswerRepository;
import com.koh.springbootone.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuestionServise {
    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    public QuestionServise(QuestionRepository questionRepository, AnswerRepository answerRepository) {
        this.questionRepository = questionRepository;
        this.answerRepository = answerRepository;
    }

    public Map<Question, List<Answer>> findAll(Long quizId) {
        Map<Question, List<Answer>> map = new HashMap<>();
        List<Question> list = questionRepository.findAllByQuizId(quizId);
        for (Question question : list) {
            List<Answer> ansList=answerRepository.findByQuestionsId(question.getId());
            map.put(question, ansList);
        }

        return map;
    }
}
