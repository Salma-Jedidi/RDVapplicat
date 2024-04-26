package com.example.RDV.repository;
import com.example.RDV.entities.RDV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rdvRepository extends JpaRepository<RDV, Integer> {
}
