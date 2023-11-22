package com.emanuel.addressservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressDTO {

    private Long id;
    private String cep;
    private String street;
    private String number;
    private String houseNumber;
    private Long employeeId;

}
