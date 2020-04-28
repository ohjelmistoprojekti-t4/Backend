package com.example.kyselyBack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.kyselyBack.domain.Option;
import com.example.kyselyBack.domain.OptionRepository;
import com.example.kyselyBack.domain.Question;
import com.example.kyselyBack.domain.QuestionRepository;
import com.example.kyselyBack.domain.UserAnswers;
import com.example.kyselyBack.domain.UserAnswersRepository;

@SpringBootApplication
public class KyselyBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(KyselyBackApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner exampleQuestion(QuestionRepository qRepo, OptionRepository oRepo, UserAnswersRepository uaRepo) {
		return(args) -> {
			oRepo.save(new Option("Kyl", "Ehkä", "Ei", null, null));
			oRepo.save(new Option("Free write", null, null, null, null));
			System.out.println("vaihtoehdot tökätty");
			qRepo.save(new Question("Do you agree with this question?", 1, oRepo.findById((long) 1).get()));
			qRepo.save(new Question("Is this checkbox, check all that are correct", 2, oRepo.findById((long) 1).get()));
			qRepo.save(new Question("Hello? What is your name", 3, oRepo.findById((long) 2).get()));
			System.out.println("kysymykset lisätty");
			uaRepo.save(new UserAnswers("Testipena", 3, qRepo.findById((long) 5).get()));
			System.out.println("vastaus lisätty");
			
		};
	}
}