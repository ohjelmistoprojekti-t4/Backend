package com.example.kyselyBack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.example.kyselyBack.domain.AnswerSet;
import com.example.kyselyBack.domain.Option;
import com.example.kyselyBack.domain.Question;
import com.example.kyselyBack.domain.Survey;
import com.example.kyselyBack.domain.UniqueUserSession;
import com.example.kyselyBack.domain.UserAnswer;

@Configuration
public class AppConfig {
	
	@Bean
	public RepositoryRestConfigurer repoRestConfig() {
		return RepositoryRestConfigurer.withConfig(config -> {
			config.exposeIdsFor(Question.class);
			config.exposeIdsFor(UserAnswer.class);
			config.exposeIdsFor(Option.class);
			config.exposeIdsFor(Survey.class);
			config.exposeIdsFor(AnswerSet.class);
			config.exposeIdsFor(UniqueUserSession.class);
		});
	}
	
}
