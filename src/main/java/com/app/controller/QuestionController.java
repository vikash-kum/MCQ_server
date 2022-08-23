package com.app.controller;

import com.app.entity.Question;
import com.app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class QuestionController {

    @Autowired
    QuestionService questionService;


    // Sending all Subject
    @GetMapping("/subject")
    List<String> getSubject() {
        System.out.println("Get Question");
        return questionService.subjects();
    }

    // Sending all Topic based on subject
    @GetMapping("/{subject}/topic")
    public List<String> getTopic(@PathVariable("subject") String subject) {
        return questionService.topics(subject);
    }


    // Sending all Question based on subject
    @GetMapping("/questions/{subject}")
    List<Question> getQuestions(@PathVariable("subject") String subject) {
        return questionService.getQuestionsBasedOnSubject(subject);
    }

    // Sending All questions base on subject and topic
    @GetMapping("/questions/{subject}/{topic}")
    List<Question> getAllQuestion(@PathVariable("subject") String subject ,@PathVariable("topic") String topic){
        return questionService.getQuestionsBasedOnSubjectAndTopic(subject , topic);
    }
}
