package com.quizApplication.Online_Quiz_Application;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String content;
	    private boolean correct;

	    @ManyToOne
	    @JoinColumn(name = "question_id")
	    private Question question;
}
