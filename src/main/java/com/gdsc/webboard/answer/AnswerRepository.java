package com.gdsc.webboard.answer;
import com.gdsc.webboard.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}