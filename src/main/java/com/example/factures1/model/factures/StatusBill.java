package com.example.factures1.model.factures;

import jakarta.persistence.*;

@Entity
public class StatusBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private StatusBillType status;

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusBillType getStatus() {
        return status;
    }

    public void setStatus(StatusBillType status) {
        this.status = status;
    }
}
