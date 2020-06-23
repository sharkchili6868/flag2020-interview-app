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

    /**
     * @return list of feedback json array
     */
    @GetMapping("/feedback")
    public List<Feedback> listAllFeedback() {
        return feedbackService.listAllFeedback();
    }


    /**
     *
     * @param id -> primary key of feedback object in database
     * @return
     */
    @GetMapping("/feedback/{id}")
    public Feedback listFeedbackById(@PathVariable int id) {
        return feedbackService.listFeedbackById(id);
    }

    /**
     *
     * @param feedback -> json body of feedback that you want to post
     */
    @PostMapping("/feedback")
    public void createNewFeedback(@RequestBody Feedback feedback) {
        Date now = new Date();
        feedback.setInterviewDate(now);
        feedbackService.createNewFeedback(feedback);
    }

    /**
     *
     * @param feedback -> json body of feedback that you want to edit
     * @param id -> primary key of feedback object in database
     */
    @PutMapping("/feedback/{id}")
    public void editFeedbackById(@RequestBody Feedback feedback, @PathVariable int id) {
        feedbackService.editFeedbackById(feedback, id);
    }

    /**
     *
     * @param evaluator -> name of evaluator
     * @return -> all feedback object as an array under this evaluator
     */
    @GetMapping("/feedback/evaluator")
    public List<Feedback> listAllFeedbackByEvaluator(@RequestParam String evaluator) {
        return feedbackService.listAllFeedbackByEvaluator(evaluator);
    }

    /**
     *
     * @param interviewee -> name of interviewee
     * @return -> all feedback object as an array under this interviewee
     */
    @GetMapping("/feedback/interviewee")
    public List<Feedback> listAllFeedbackByInterviewee(@RequestParam String interviewee) {
        return feedbackService.listAllFeedbackByEvaluator(interviewee);
    }
}
