package com.quizApplication.Online_Quiz_Application;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>{
	
	Optional<Quiz> findByQuizName(String quizName);

}
