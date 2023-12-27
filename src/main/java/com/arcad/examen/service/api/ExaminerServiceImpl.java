package com.arcad.examen.service.api;

import com.arcad.examen.entity.Question;
import com.arcad.examen.service.exception.FullSetAnswerException;
import com.arcad.examen.service.impl.ExaminerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ExaminerServiceImpl implements ExaminerService {

    private final JavaQuestionService javaQuestion;
    private final MathQuestionService mathQuestion;

    @Override
    public Collection<Question> getQuestions(int answer) throws FullSetAnswerException {
        if (answer > (javaQuestion.size()+ mathQuestion.size()))
            throw new FullSetAnswerException("Есть только "
                    + (javaQuestion.size()+ mathQuestion.size()) + " вопросов.");

        Set<Question> collect = new HashSet<>();
        int j = answer / 2;
        while (collect.size() < j) {
            collect.add(javaQuestion.getRandomQuestion());
        }
        while (collect.size() < answer) {
            collect.add(mathQuestion.getRandomQuestion());
        }
        return collect;
    }
}
