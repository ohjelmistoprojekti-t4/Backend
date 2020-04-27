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
			
			qRepo.deleteAll();
			oRepo.deleteAll();
			uaRepo.deleteAll();
			
			
			qRepo.save(new Question("Mikä on nimesi?", 3));
			oRepo.save(new Option("Vapaa kirjoitus", qRepo.findById((long) 1).get()));
			oRepo.save(new Option("Haista vittu", qRepo.findById((long) 1).get()));
			uaRepo.save(new UserAnswers("Pena", 3, qRepo.findById((long) 1).get()));
			uaRepo.save(new UserAnswers("Arska", 3, qRepo.findById((long) 1).get()));
		};
	}
}