package com.emanuel.employeeapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class AddressDto {

    private Long id;
    private String cep;
    private String street;
    private String number;
    private String houseNumber;

}
