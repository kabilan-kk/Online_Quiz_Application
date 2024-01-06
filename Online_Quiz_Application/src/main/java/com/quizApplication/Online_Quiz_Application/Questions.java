package com.quizApplication.Online_Quiz_Application;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Questions {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String content;

	    @ManyToOne
	    @JoinColumn(name = "quiz_id")
	    private Quiz quiz;

	    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
	    private List<Answer> answers;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Quiz getQuiz() {
			return quiz;
		}

		public void setQuiz(Quiz quiz) {
			this.quiz = quiz;
		}

		public List<Answer> getAnswers() {
			return answers;
		}

		public void setAnswers(List<Answer> answers) {
			this.answers = answers;
		}

	    
}
