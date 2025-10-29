package com.example.JaxrsApplication.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Enumerated(EnumType.ORDINAL)
    private TypeCompte type;

    public Compte(Object object, double d, Date date, TypeCompte epargne) {
        // We ignore 'object' because it's the 'id' (null)
        this.solde = d;
        this.dateCreation = date;
        this.type = epargne;
    }




}