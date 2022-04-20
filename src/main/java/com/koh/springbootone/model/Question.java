package com.koh.springbootone.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Oleksandr Kokhaniuk
 * @created 4/20/2022, 8:52 PM
 */
@Data
@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="quiz_id")
    private Long quizId;

    @Column(name="body")
    private String body;



}
