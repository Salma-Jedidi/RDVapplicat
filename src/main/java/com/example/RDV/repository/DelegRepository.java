package com.example.RDV.repository;
import com.example.RDV.entities.Delegation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DelegRepository extends JpaRepository<Delegation, String> {
}
