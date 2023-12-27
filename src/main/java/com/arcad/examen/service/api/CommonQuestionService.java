package com.arcad.examen.service.api;

import com.arcad.examen.entity.Question;
import com.arcad.examen.repository.QuestionRepository;
import com.arcad.examen.service.impl.QuestionService;

import java.util.Collection;


public abstract class CommonQuestionService implements QuestionService {

    private final QuestionRepository questionRepository;

    public CommonQuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        return questionRepository.add(newQuestion);
    }

    @Override
    public Question add(Question question) {
        return questionRepository.add(question);
    }

    @Override
    public Question remove(Question question) {
        return questionRepository.remove(question);
    }

    @Override
    public Collection<Question> getAll() {
        return questionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        return questionRepository.getAll().stream()
                .findAny()
                .orElse(null);
    }

    @Override
    public int size() {
        return questionRepository.size();
    }
}
