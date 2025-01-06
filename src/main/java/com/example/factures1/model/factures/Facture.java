package com.example.factures1.model.factures;

import com.example.factures1.model.creances.Creance;
import jakarta.persistence.*;
import java.util.Date;
import java.util.Calendar;



@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@ManyToOne
    //@JoinColumn(name = "id_client", nullable = false)
    //private Client client;

    private Long client;

    @ManyToOne
    @JoinColumn(name = "id_creance", nullable = false)
    private Creance creance;

    private Date nextPayment;

    @ManyToOne
    @JoinColumn(name = "status_bill_id", nullable = false)
    private StatusBill statusBill;

    @ManyToOne
    @JoinColumn(name = "status_recurring_id", nullable = false)
    private StatusRecurring statusRecurring;

    @PrePersist
    public void prePersist() {
        if (creance != null && creance.getFrequence() != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());  // Date actuelle

            // Calcul de `nextPayment` en fonction de la fréquence
            switch (creance.getFrequence().getFrequence()) {
                case MONTH:
                    calendar.add(Calendar.DAY_OF_YEAR, 30);  // Ajouter 30 jours
                    break;
                case SIX_MONTHS:
                    calendar.add(Calendar.DAY_OF_YEAR, 6 * 30);  // Ajouter 6 * 30 jours
                    break;
                case ANNUAL:
                    calendar.add(Calendar.DAY_OF_YEAR, 12 * 30);  // Ajouter 12 * 30 jours
                    break;
            }
            nextPayment = calendar.getTime();
        }
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClient() {
        return client;
    }

    public void setClient(Long client) {
        this.client = client;
    }

    public Creance getCreance() {
        return creance;
    }

    public void setCreance(Creance creance) {
        this.creance = creance;
    }

    public Date getNextPayment() {
        return nextPayment;
    }

    public void setNextPayment(Date nextPayment) {
        this.nextPayment = nextPayment;
    }

    public StatusBill getStatusBill() {
        return statusBill;
    }

    public void setStatusBill(StatusBill statusBill) {
        this.statusBill = statusBill;
    }

    public StatusRecurring getStatusRecurring() {
        return statusRecurring;
    }

    public void setStatusRecurring(StatusRecurring statusRecurring) {
        this.statusRecurring = statusRecurring;
    }
}
