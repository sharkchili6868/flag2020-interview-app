package com.demo.controller;

import com.demo.model.Feedback;
import com.demo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FeedbackRestController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/feedback")
    public List<Feedback> listAllFeedback() {
        return feedbackService.listAllFeedback();
    }

    @GetMapping("/feedback/{id}")
    public Feedback listFeedbackById(@PathVariable int id) {
        return feedbackService.listFeedbackById(id);
    }

    @PostMapping("/feedback")
    public void createNewFeedback(@RequestBody Feedback feedback) {
        Date now = new Date();
        feedback.setInterviewDate(now);
        feedbackService.createNewFeedback(feedback);
    }

    @PutMapping("/feedback/{id}")
    public void editFeedbackById(@RequestBody Feedback feedback, @PathVariable int id) {
        feedbackService.editFeedbackById(feedback, id);
    }

    @GetMapping("/feedback/evaluator")
    public List<Feedback> listAllFeedbackByEvaluator(@RequestParam String evaluator) {
        return feedbackService.listAllFeedbackByEvaluator(evaluator);
    }

    @GetMapping("/feedback/interviewee")
    public List<Feedback> listAllFeedbackByInterviewee(@RequestParam String interviewee) {
        return feedbackService.listAllFeedbackByEvaluator(interviewee);
    }
}
