package com.example.RDV.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Delegation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codeDelegation;
    private String codeGouvernorat;
    private String libDelegation;
    @ManyToOne
    private Gouvernorat gouvernorat;
}
