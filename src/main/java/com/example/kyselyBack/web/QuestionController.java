package com.example.kyselyBack.web;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kyselyBack.domain.OptionRepository;
import com.example.kyselyBack.domain.Question;
import com.example.kyselyBack.domain.QuestionRepository;
import com.example.kyselyBack.domain.UserAnswer;
import com.example.kyselyBack.domain.UserAnswersRepository;

@RestController
public class QuestionController {
 
   
    @Autowired
    QuestionRepository qRepo;
   
    @Autowired
    OptionRepository oRepo;
    
    @Autowired
    UserAnswersRepository uaRepo;
   
    /*
     
    @RequestMapping(value="/questionsApi", method = RequestMethod.GET)
    public @ResponseBody List<Question> questionsRest() {
        return (List<Question>) qRepo.findAll();
    }
   
    @RequestMapping(value="/questionsApi/{id}", method = RequestMethod.GET)
    public @ResponseBody Optional<Question> findQuestionRest(@PathVariable("id") Long id) {
        return qRepo.findById(id);
    }
   
    @GetMapping("/questions")
      List<Question> all() {
        return (List<Question>) qRepo.findAll();
      }
    
      @RequestMapping(value="/questions", method =RequestMethod.POST)
      Question newQuestion(@RequestBody Question newQuestion, Model model) {
    	model.addAttribute("question", new Question());
    	model.addAttribute("option", oRepo.findAll());
    	oRepo.save(newQuestion.getOption());
        return qRepo.save(newQuestion);
      }

      // Single item
 
      @GetMapping("/questions/{id}")
      Optional<Question> one(@PathVariable Long id) {
 
        return qRepo.findById(id);
      }
 
      @PutMapping("/questions/{id}")
      Question replaceQuestion(@RequestBody Question newQuestion, @PathVariable Long id) {
         
          return qRepo.findById(id)
                  .map(n -> {
                    n.setQuestion(newQuestion.getQuestion());
                    n.setOption(newQuestion.getOption());
                    n.setType(newQuestion.getType());
                    return qRepo.save(n);
                  })
                  .orElseGet(() -> {
                    newQuestion.setId(id);
                    return qRepo.save(newQuestion);
                  });
      }
 
      @DeleteMapping("/questions/{id}")
      void deleteQuestion(@PathVariable Long id) {
        qRepo.deleteById(id);
      }
      
      @GetMapping("/userAnswerses")
      List<UserAnswers> allUserAnswers() {
        return (List<UserAnswers>) uaRepo.findAll();
      }
      
      @GetMapping("/userAnswerses/{id}")
      Optional<UserAnswers> specificUserAnswer(@PathVariable Long id) {
 
        return uaRepo.findById(id);
      }
      
      @RequestMapping(value="/userAnswerses", method =RequestMethod.POST)
      UserAnswers newAnswer(@RequestBody UserAnswers newAnswer, Model model) {
    	model.addAttribute("userAnswers", new UserAnswers());
    	model.addAttribute("question", qRepo.findAll());
        return uaRepo.save(newAnswer);
      }
      
      @PutMapping("/userAnswerses/{id}")
      UserAnswers replaceAnswer(@RequestBody UserAnswers newAnswer, @PathVariable Long id) {
         
          return uaRepo.findById(id)
                  .map(n -> {
                    n.setTextAnswer(newAnswer.getTextAnswer());
                    n.setQuestion(newAnswer.getQuestion());
                    n.setType(newAnswer.getType());
                    return uaRepo.save(n);
                  })
                  .orElseGet(() -> {
                    newAnswer.setUserAnswerId(id);
                    return uaRepo.save(newAnswer);
                  });
      }
      
      @DeleteMapping("/userAnswerses/{id}")
      void deleteAnswer(@PathVariable Long id) {
        uaRepo.deleteById(id);
      }
      
      */
      
      
      
}
