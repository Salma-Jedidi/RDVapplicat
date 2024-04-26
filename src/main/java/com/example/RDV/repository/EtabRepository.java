package com.example.RDV.repository;
import com.example.RDV.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtabRepository extends JpaRepository<Etablissement, String> {
}
