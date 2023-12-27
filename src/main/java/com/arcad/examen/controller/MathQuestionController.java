package com.arcad.examen.controller;

import com.arcad.examen.entity.Question;
import com.arcad.examen.service.impl.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/math")
public class MathQuestionController {

    private final QuestionService mathQuestionService;

    public MathQuestionController(QuestionService mathQuestionService) {
        this.mathQuestionService = mathQuestionService;
    }

    @GetMapping("/questions")
    public Collection<Question> getAllQuestions() {
        return mathQuestionService.getAll();
    }
    @PostMapping("/questions")
    public Question addQuestion(@RequestBody Question question) {
        return mathQuestionService.add(question);
    }
}
