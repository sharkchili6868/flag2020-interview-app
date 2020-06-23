package com.demo.repository;

import com.demo.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

    @Query(value = "SELECT * FROM Feedback f WHERE f.evaluator = :evaluator", nativeQuery = true)
    List<Feedback> listAllFeedbackByEvaluator(@Param("evaluator") String evaluator);

    @Query(value = "SELECT * FROM Feedback f WHERE f.interviewee = :interviewee", nativeQuery = true)
    List<Feedback> listAllFeedbackByInterviewee(@Param("interviewee") String interviewee);
}
