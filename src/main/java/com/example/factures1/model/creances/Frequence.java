package com.example.factures1.model.creances;


import jakarta.persistence.*;
@Entity
public class Frequence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFrequence;

    @Enumerated(EnumType.STRING)
    private FrequenceType frequence; // L'énumération

    // Getters et Setters
    public Long getIdFrequence() {
        return idFrequence;
    }

    public void setIdFrequence(Long idFrequence) {
        this.idFrequence = idFrequence;
    }

    public FrequenceType getFrequence() {
        return frequence;
    }

    public void setFrequence(FrequenceType frequence) {
        this.frequence = frequence;
    }
}

