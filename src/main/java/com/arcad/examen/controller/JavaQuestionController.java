package com.arcad.examen.Controller;

import com.arcad.examen.entity.Question;
import com.arcad.examen.service.api.JavaQuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
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
