package com.example.kyselyBack.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EndUser  {

    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
    
    @Id
	private String username;
    
    @JsonIgnore
    private String password;
    
    @JsonIgnore
    private String[] roles;

    public EndUser() {
        super();
    }

    public EndUser(String username, String password, String[] roles) {
        
        this.username = username;
        setPassword(password);
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PASSWORD_ENCODER.encode(password);
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }
}