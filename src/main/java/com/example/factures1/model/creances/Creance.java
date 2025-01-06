package com.example.factures1.model.creances;

import com.example.factures1.model.creanciers.Creancier;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Creance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_creancier", nullable = false)
    private Creancier creancier; // Relation avec l'entité Creancier

    private String title;
    private BigDecimal montant;
    private String description;

    @ManyToOne
    @JoinColumn(name = "frequence_id")
    private Frequence frequence; // Relation avec l'entité Frequence

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Creancier getCreancier() {
        return creancier;
    }

    public void setCreancier(Creancier creancier) {
        this.creancier = creancier;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Frequence getFrequence() {
        return frequence;
    }

    public void setFrequence(Frequence frequence) {
        this.frequence = frequence;
    }
}

