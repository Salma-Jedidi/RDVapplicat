package com.example.RDV.repository;

import com.example.RDV.entities.Gouvernorat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GovRepository extends JpaRepository<Gouvernorat, String> {
}
