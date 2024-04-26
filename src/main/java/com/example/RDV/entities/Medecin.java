package com.example.RDV.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data

public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedecin;
    private String codeSpecialite;
    private String nomMedecin;
    private Integer CIN;
    private String tel;
    private int prixConsultation;
    @OneToMany(mappedBy = "medecin")
    private List<RDV> rdvs;
    @OneToOne
    private Specialite specialite;
    @OneToOne
    private Service service;
}

