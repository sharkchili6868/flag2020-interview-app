package com.demo.service.impl;

import com.demo.model.Feedback;
import com.demo.repository.FeedbackRepository;
import com.demo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public List<Feedback> listAllFeedback() {
        return feedbackRepository.findAll();
    }

    @Override
    public Feedback listFeedbackById(int id) {
        Optional<Feedback> feedback = feedbackRepository.findById(id);
        if (!feedback.isPresent()) {
            throw new RuntimeException("Feedback with this id is not found");
        }

        return feedback.get();
    }

    @Override
    public void createNewFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }

    @Override
    public void editFeedbackById(Feedback feedback, int id) {
        feedback.setId(id);
        feedbackRepository.save(feedback);
    }

    @Override
    public List<Feedback> listAllFeedbackByEvaluator(String evaluator) {
        return feedbackRepository.listAllFeedbackByEvaluator(evaluator);
    }

    @Override
    public List<Feedback> listAllFeedbackByInterviewee(String interviewee) {
       return feedbackRepository.listAllFeedbackByInterviewee(interviewee);
    }
}
