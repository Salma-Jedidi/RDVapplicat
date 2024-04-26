package com.example.RDV.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Gouvernorat {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codeGouvernorat;
    private String libGouvernorat;
    @OneToMany(mappedBy = "gouvernorat")
    private List<Delegation> delegations;
}