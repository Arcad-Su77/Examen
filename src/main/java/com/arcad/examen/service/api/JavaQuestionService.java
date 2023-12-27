package com.arcad.examen.service.api;

import com.arcad.examen.entity.Question;
import com.arcad.examen.repository.JavaQuestionRepository;
import com.arcad.examen.service.impl.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class JavaQuestionService extends CommonQuestionService {

    public JavaQuestionService(JavaQuestionRepository javaRepository) {
        super(javaRepository);
    }

}
