package com.example.RDV.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String codeEtablissement;
    private String codeGouvernorat;
    private String libEtablissement;
    @ManyToOne
    private Gouvernorat gouvernorat;
    @ManyToOne
    private MedecinPublic medecinPublic;

}
