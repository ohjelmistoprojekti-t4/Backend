package com.example.kyselyBack;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.kyselyBack.domain.AnswerSet;
import com.example.kyselyBack.domain.AnswerSetRepository;
import com.example.kyselyBack.domain.Option;
import com.example.kyselyBack.domain.OptionRepository;
import com.example.kyselyBack.domain.Question;
import com.example.kyselyBack.domain.QuestionRepository;
import com.example.kyselyBack.domain.Survey;
import com.example.kyselyBack.domain.SurveyRepository;
import com.example.kyselyBack.domain.UniqueUserSession;
import com.example.kyselyBack.domain.UniqueUserSessionRepository;
import com.example.kyselyBack.domain.UserAnswer;
import com.example.kyselyBack.domain.UserAnswersRepository;

@SpringBootApplication
public class KyselyBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(KyselyBackApplication.class, args);
	}
	
	@Bean

	public CommandLineRunner exampleQuestion(QuestionRepository qRepo, OptionRepository oRepo, 
			UserAnswersRepository uaRepo, SurveyRepository sRepo, AnswerSetRepository asRepo, UniqueUserSessionRepository uuRepo) {


		return(args) -> {
			
			/*sRepo.deleteAll();
			oRepo.deleteAll();
			qRepo.deleteAll();
			uaRepo.deleteAll();
			asRepo.deleteAll();
			uuRepo.deleteAll();*/

			

			
			/*sRepo.save(new Survey("Testisurvey1"));
			System.out.println("1");
			qRepo.save(new Question("Mikä on nimesi?", 3, sRepo.findById((long) 1).get()));
			qRepo.save(new Question("Valitse oikeat vaihtoehdot", 2, sRepo.findById((long) 1).get()));
			qRepo.save(new Question("Pidätkö omenoista?", 1, sRepo.findById((long) 1).get()));
			qRepo.save(new Question("Käytkö elokuvissa?", 1, sRepo.findById((long) 1).get()));
			System.out.println("2");
			oRepo.save(new Option("A", qRepo.findById((long) 3).get()));
			oRepo.save(new Option("B", qRepo.findById((long) 3).get()));
			oRepo.save(new Option("C", qRepo.findById((long) 3).get()));
			oRepo.save(new Option("Kyllä", qRepo.findById((long) 4).get()));
			oRepo.save(new Option("En osaa sanoa", qRepo.findById((long) 4).get()));
			oRepo.save(new Option("En", qRepo.findById((long) 4).get()));
			oRepo.save(new Option("Melkein joka viikko", qRepo.findById((long) 5).get()));
			oRepo.save(new Option("3-4 kertaa kuukaudessa", qRepo.findById((long) 5).get()));
			oRepo.save(new Option("Hyvin harvoin", qRepo.findById((long) 5).get()));
			asRepo.save(new AnswerSet());
			uaRepo.save(new UserAnswer("Pena", 3, qRepo.findById((long) 2).get(), asRepo.findById((long) 15).get()));
			uaRepo.save(new UserAnswer("Arska", 3, qRepo.findById((long) 2).get(), asRepo.findById((long) 15).get()));
			uaRepo.save(new UserAnswer(1, qRepo.findById((long) 4).get(), oRepo.findById((long) 9).get(), asRepo.findById((long) 15).get()));
			
			uuRepo.save(new UniqueUserSession(sRepo.findById((long) 1).get(), asRepo.findById((long) 15).get()));

			*/

		};
	}
}