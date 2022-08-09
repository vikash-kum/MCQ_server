package com.app.service;

import com.app.dao.QuestionRepository;
import com.app.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public Question addQuestion (Question question) {
        return questionRepository.save(question);
    }

    public List<Question> getSubjectQuestion(String subject) {
        return questionRepository.findBySubject(subject);
    }

    public List<String> subjects() {
        return questionRepository.getAllSubject();
    }

    public List<String> topics(String subject) {
        return questionRepository.getAllTopic(subject);
    }
}
