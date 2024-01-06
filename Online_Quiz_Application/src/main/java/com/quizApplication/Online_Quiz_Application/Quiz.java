package com.quizApplication.Online_Quiz_Application;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Quiz {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    
	    private String quizId;  

	    private String quizName;
	    private Integer duration;

	 


	    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
	    private List<Question> questions;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public List<Question> getQuestions() {
			return questions;
		}

		public void setQuestions(List<Question> questions) {
			this.questions = questions;
		}

		    public String getQuizId() {
		        return quizId;
		    }

		    public void setQuizId(String quizId) {
		        this.quizId = quizId;
		    }

		    public String getQuizName() {
		        return quizName;
		    }

		    public void setQuizName(String quizName) {
		        this.quizName = quizName;
		    }

		    public Integer getDuration() {
		        return duration;
		    }

		    public void setDuration(Integer duration) {
		        this.duration = duration;
		    }

	    
}
