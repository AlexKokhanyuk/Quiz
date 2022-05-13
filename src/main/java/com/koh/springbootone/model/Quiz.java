package com.koh.springbootone.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Oleksandr Kokhaniuk
 * @created 4/20/2022, 7:33 PM
 */

@Data
@Entity
@Table(name="quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToMany
    @Column(name="user_id")
    private Long userId;

    @Column(name = "sequence_number")
    private int sequenceNumber;

    @Column(name="title")
    private String title;

    @Column(name="comment")
    private String comment;
}
