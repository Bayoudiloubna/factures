package com.example.factures1.repository;


import com.example.factures1.model.creances.Creance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreanceRepository extends JpaRepository<Creance, Long> {

}

