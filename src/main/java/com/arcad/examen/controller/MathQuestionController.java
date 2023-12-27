package com.arcad.examen.Controller;

import com.arcad.examen.entity.Question;
import com.arcad.examen.service.api.MathQuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/math")
public class MathQuestionController {

    private final MathQuestionService mathQuestionService;

    public MathQuestionController(MathQuestionService mathQuestionService) {
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
