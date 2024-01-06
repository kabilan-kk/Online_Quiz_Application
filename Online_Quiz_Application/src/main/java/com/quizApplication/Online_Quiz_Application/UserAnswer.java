package com.quizApplication.Online_Quiz_Application;


public class UserAnswer {
 private Long questionId;
 public Long getQuestionId() {
	return questionId;
}
public void setQuestionId(Long questionId) {
	this.questionId = questionId;
}
public String getSelectedOption() {
	return selectedOption;
}
public void setSelectedOption(String selectedOption) {
	this.selectedOption = selectedOption;
}
private String selectedOption;
 
}


