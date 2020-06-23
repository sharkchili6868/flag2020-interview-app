package com.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "feedback")
@Data
@NoArgsConstructor
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "evaluator")
    private String evaluator;

    @Column(name = "interviewee")
    private String interviewee;

    @Column(name = "clarification")
    private int clarification;

    @Column(name ="problem_given")
    private String problemGiven;

    @Column(name = "clarify_feedback")
    private String clarifyFeedback;

    @Column(name = "demonstration")
    private int demonstration;

    @Column(name = "demo_feedback")
    private String demoFeedback;

    @Column(name = "coding")
    private int coding;

    @Column(name = "coding_feedback")
    private String codingFeedback;

    @Column(name = "analysis")
    private int analysis;

    @Column(name = "analysis_feedback")
    private String analysisFeedback;

    @Column(name = "communication")
    private int communication;

    @Column(name = "communication_feedback")
    private String communicationFeedback;

    @Column(name = "interview_date")
    private Date interviewDate;

    public Feedback(String evaluator, String interviewee, int clarification, String clarifyFeedback, int demonstration, String demoFeedback, int coding, String codingFeedback, int analysis, String analysisFeedback, int communication, String communicationFeedback, Date interviewDate) {
        this.evaluator = evaluator;
        this.interviewee = interviewee;
        this.clarification = clarification;
        this.clarifyFeedback = clarifyFeedback;
        this.demonstration = demonstration;
        this.demoFeedback = demoFeedback;
        this.coding = coding;
        this.codingFeedback = codingFeedback;
        this.analysis = analysis;
        this.analysisFeedback = analysisFeedback;
        this.communication = communication;
        this.communicationFeedback = communicationFeedback;
        this.interviewDate = new Date();
    }
}
