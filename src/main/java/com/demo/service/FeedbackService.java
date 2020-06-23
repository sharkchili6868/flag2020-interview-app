package com.demo.service;

import com.demo.model.Feedback;

import java.util.List;

public interface FeedbackService {
    List<Feedback> listAllFeedback();

    Feedback listFeedbackById(int id);

    void createNewFeedback(Feedback feedback);

    void editFeedbackById(Feedback feedback, int id);

    List<Feedback> listAllFeedbackByEvaluator(String evaluator);

    List<Feedback> listAllFeedbackByInterviewee(String interviewee);
}
