package com.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String content;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String topic;
    private String subject;
    private String correctAnswer;
    private boolean isCorrect;

    public Question() {
    }
}
