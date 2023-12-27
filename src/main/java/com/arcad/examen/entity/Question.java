package com.arcad.examen.entity;

import lombok.*;
import org.springframework.stereotype.Repository;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class Question {

    private String question;
    private String answer;

}
