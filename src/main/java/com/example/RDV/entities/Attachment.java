package com.example.RDV.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Embeddable
@Data
public class Attachment {
  /*  @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String fileName;
    private String contentType;*/
    private byte[] content;
}
