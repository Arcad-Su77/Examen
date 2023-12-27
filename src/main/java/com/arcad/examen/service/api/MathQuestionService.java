package com.arcad.examen.service.api;

import com.arcad.examen.repository.MathQuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class MathQuestionService extends CommonQuestionService {

    public MathQuestionService(MathQuestionRepository mathRepository) {
        super(mathRepository);
    }

}
