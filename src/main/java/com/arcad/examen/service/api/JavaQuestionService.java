package com.arcad.examen.service.iapi;

import com.arcad.examen.entity.Question;
import com.arcad.examen.service.impl.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {

    Set<Question> questionSet;
    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
