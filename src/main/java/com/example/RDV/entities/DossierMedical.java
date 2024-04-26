package com.example.RDV.entities;

import jakarta.persistence.*;
import lombok.Data;
@Embeddable
@Data
public class DossierMedical {
  /*  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDossier;*/
    private byte[] attachmentData;
}
