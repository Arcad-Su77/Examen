package com.arcad.examen.controller;

import com.arcad.examen.entity.Question;
import com.arcad.examen.service.api.ExaminerServiceImpl;
import com.arcad.examen.service.exception.FullSetAnswerException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExaminerController {
    public final ExaminerServiceImpl examinerService;

    public ExaminerController(ExaminerServiceImpl examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/questions/{answer}")
    public Collection<Question> getQuestions(@PathVariable int answer) throws FullSetAnswerException {
        return examinerService.getQuestions(answer);
    }
}
