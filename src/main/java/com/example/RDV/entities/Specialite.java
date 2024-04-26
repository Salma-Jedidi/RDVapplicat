package com.example.RDV.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Specialite {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codeSpecialite;
    private String libSpecialite;
}
