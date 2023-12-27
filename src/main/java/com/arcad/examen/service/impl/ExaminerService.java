package com.arcad.examen.service.impl;

import com.arcad.examen.entity.Question;
import com.arcad.examen.service.exception.FullSetAnswerException;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int answer) throws FullSetAnswerException;
}
