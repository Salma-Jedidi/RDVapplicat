package com.example.RDV.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.Date;
@Entity
@Data
public class RDV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRDV;
    private Date dateRDV;

    private LocalTime heureRdv;


    @ManyToOne
    private Medecin medecin;
    @ManyToOne
    private MedecinPrive medecinPrive;
    @ManyToOne
    private MedecinPublic medecinPublic;

    @ManyToOne
    private Patient patient;
@Enumerated
    private EtatRDV etatRDV;
}
