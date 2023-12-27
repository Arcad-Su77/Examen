package com.arcad.examen.controller;

import com.arcad.examen.entity.Question;
import com.arcad.examen.service.impl.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    private final QuestionService javaQuestionService;

    public JavaQuestionController(QuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }
    @GetMapping("/")
    public Collection<Question> getAllQuestions() {
        return javaQuestionService.getAll();
    }
    @PostMapping("/add")
    public Question addQuestion(@RequestParam String question,
                                @RequestParam String answer) {
        return javaQuestionService.add(question,answer);
    }
    @PostMapping("/remove")
    public Question removeQuestion(@RequestParam String question,
                                   @RequestParam String answer) {
        Question remQuestion = new Question(question, answer);
        return javaQuestionService.remove(remQuestion);
    }


}
