package com.arcad.examen.repository;

import com.arcad.examen.entity.Question;

import java.util.Collection;

public interface QuestionRepository {
    void init();

    Question add(String question, String answer);
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
    int size();


}
