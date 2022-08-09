package com.app.controller;

import com.app.entity.Question;
import com.app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/admin")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    // Adding question
    @PostMapping("/addquestion")
    Question addQuestion(@ModelAttribute Question question) {
        System.out.println(question);
        return questionService.addQuestion(question);
    }

    // Sending all Subject
    @GetMapping("/subject")
    List<String> getSubject() {
        return questionService.subjects();
    }

    // Sending all Topic based on subject
    @GetMapping("/{subject}/topic")
    public List<String> getTopic(@PathVariable("subject") String subject) {
        return questionService.topics(subject);
    }


//    // Sending all Question based on topic
//    @GetMapping("{subject}/{topic}/question")
//    List<Question> getQuestion(@PathVariable("topic") String topic) {
//        return questionService.getQuestions(topic);
//    }

//    // Sending All question from question table
//    @GetMapping("{subject}/question")
//    List<Question> getAllQuestion(@PathVariable("subject") String subject){
//        return questionService.getpSubjectQuestion(subject);
//    }

}
