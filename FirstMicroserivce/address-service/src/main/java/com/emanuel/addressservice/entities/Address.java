package com.emanuel.addressservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String cep;
    private String street;
    private String number;
    private String houseNumber;
    private Long employeeId;
}
