package com.example.RDV.repository;
import com.example.RDV.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedRepository extends JpaRepository<Medecin, Integer> {
}
