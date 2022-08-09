package com.app.dao;

import com.app.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    List<Question> findByTopic(String topic);

    List<Question> findBySubjectAndTopic(String subject, String topic);

    @Query("select distinct subject from Question")
    List<String> getAllSubject();

    List<Question> findBySubject(String subject);

    @Query("select distinct topic from Question where subject = :subject")
    List<String> getAllTopic(String subject);
}
