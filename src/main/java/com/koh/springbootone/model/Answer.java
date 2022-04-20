package com.koh.springbootone.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Oleksandr Kokhaniuk
 * @created 4/20/2022, 9:51 PM
 */
@Data
@Entity
@Table(name="answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="questions_id")
    private Long questionsId;

    @Column(name="text")
    private String text;

    @Column(name="rating")
    private int rating;

    @Column(name="single_answer")
    private Boolean singleAnswer;

    @Column(name="question_order")
    private int questionOrder;

}
