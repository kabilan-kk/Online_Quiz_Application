package com.quizApplication.Online_Quiz_Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quizApplication.Online_Quiz_Application.Result;
import java.util.List;
import java.util.UUID; 

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public Quiz createQuiz(Quiz quiz) {
    	
        
        if (quizRepository.findByQuizName(quiz.getQuizName()).isPresent()) {
            throw new IllegalArgumentException("Quiz with the same name already exists");
        }

        

        
        if (quiz.getDuration() == null) {
            quiz.setDuration(60);
        }

        
        if (quiz.getQuizId() == null) {
            quiz.setQuizId(generateUniqueId()); 
        }

        
        return quizRepository.save(quiz);
    }
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }
    

    public Quiz getQuizById(Long quizId) {
        return quizRepository.findById(quizId).orElse(null);
    }

    

    private String generateUniqueId() {
    	
        
        return UUID.randomUUID().toString();
    }
    
    public Result submitQuiz(Long quizId, List<UserAnswer> userAnswers) {
        
        return new Result(); 
    }
}
