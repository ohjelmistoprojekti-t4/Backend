package com.example.kyselyBack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

import com.example.kyselyBack.domain.EndUser;

@Component
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    UDService detailsService;
    
    @Autowired
	private AuthenticationEntryPoint authEntryPoint;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(detailsService).passwordEncoder(EndUser.PASSWORD_ENCODER);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        	.authorizeRequests()
            .antMatchers(HttpMethod.GET, "/**").permitAll()
        .and()
        	.authorizeRequests()
        	.antMatchers(HttpMethod.GET, "/getUserAnswersBySurvey/**").permitAll()
        .and()
            .authorizeRequests()
            .antMatchers(HttpMethod.POST, "/api/userAnswers").permitAll()
        .and()
            .authorizeRequests()
            .antMatchers("/api/endUsers").authenticated()
        .and()
            .authorizeRequests().anyRequest().authenticated()
		.and()
			.httpBasic()
			.authenticationEntryPoint(authEntryPoint)
        .and()
        	.csrf().disable();
                
                
    }
}
