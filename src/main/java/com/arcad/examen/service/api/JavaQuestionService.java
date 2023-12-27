package com.arcad.examen.service.api;

import com.arcad.examen.repository.JavaQuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class JavaQuestionService extends CommonQuestionService {

    public JavaQuestionService(JavaQuestionRepository javaRepository) {
        super(javaRepository);
    }

}
