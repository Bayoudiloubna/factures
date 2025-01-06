package com.example.factures1.model.factures;

import jakarta.persistence.*;
@Entity
public class StatusRecurring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private StatusRecurringType status;

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusRecurringType getStatus() {
        return status;
    }

    public void setStatus(StatusRecurringType status) {
        this.status = status;
    }
}
