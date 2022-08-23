package com.app.controller;

import com.app.entity.Question;
import com.app.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("admin")
public class AdminController {

        @Autowired
        QuestionService questionService;

        // Adding question
        @PostMapping("/addquestion")
        Question addQuestion(@ModelAttribute Question question) {
            return questionService.addQuestion(question);
        }
}
