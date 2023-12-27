package com.arcad.examen.repository;

import com.arcad.examen.entity.Question;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Repository
public class JavaQuestionRepository implements QuestionRepository {

    private Set<Question> questionSet;
    public JavaQuestionRepository() {
        questionSet = new HashSet<>();
    }

    @PostConstruct
    @Override
    public void init(){
        questionSet.add(new Question("Вопрос 1", "Ответ 1"));
        questionSet.add(new Question("Вопрос 2", "Ответ 2"));
        questionSet.add(new Question("Вопрос 3", "Ответ 3"));
        questionSet.add(new Question("Вопрос 4", "Ответ 4"));
        questionSet.add(new Question("Вопрос 5", "Ответ 5"));
    }

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        return (questionSet.add(newQuestion)) ? newQuestion : null;
    }

    @Override
    public Question add(Question newQuestion) {
        return (questionSet.add(newQuestion)) ? newQuestion : null;
    }

    @Override
    public Question remove(Question oldQuestion) {
        return (questionSet.add(oldQuestion)) ? oldQuestion : null;
    }

    @Override
    public Collection<Question> getAll() {
        return questionSet;
    }

    @Override
    public int size() {
        return questionSet.size();
    }
}
