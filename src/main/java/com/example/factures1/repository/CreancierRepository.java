package com.example.factures1.repository;



import com.example.factures1.model.creanciers.Creancier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreancierRepository extends JpaRepository<Creancier, Long> {
}
