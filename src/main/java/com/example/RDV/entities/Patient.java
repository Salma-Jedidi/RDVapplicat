package com.example.RDV.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Data
@Entity
public class Patient  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPatient;
    private String nomPatient;
    private Date dateNaissance;
    private Integer CIN;
    private Integer telephone;
    private String email;
    private String codeSpecialite;
    private String codeDelegation;
    private String codeService;
   @Embedded
    private Attachment pieceJointe;
    @Enumerated(EnumType.STRING)
    private Role role ;

    @Enumerated(EnumType.STRING)
    private TypeCaisse typeCaisse;
    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;
    @OneToMany(mappedBy = "patient")
    private List<RDV> rdvs;
 @Embedded
    private DossierMedical dossierMedical;


    private String password;
    private LocalDate dateCreation = LocalDate.now();

}
