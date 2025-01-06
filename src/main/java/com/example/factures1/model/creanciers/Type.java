package com.example.factures1.model.creanciers;


import jakarta.persistence.*;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING) // Utilisation de EnumType.STRING pour persister en tant que chaîne
    private TypeCreancier nom;  // Maintenant, c'est un enum

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeCreancier getNom() {
        return nom;
    }

    public void setNom(TypeCreancier nom) {
        this.nom = nom;
    }
}
