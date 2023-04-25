package com.spring.kafkaproject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Employe {

    private String prenom;
    private String nom;
    private int age;
}
