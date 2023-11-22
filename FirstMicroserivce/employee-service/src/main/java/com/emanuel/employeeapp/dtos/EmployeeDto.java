package com.emanuel.employeeapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
public class EmployeeDto {


    private Long id;
    private String name;
    private String email;
    private String bloodGroup;
    private AddressDto addressDto;



}
