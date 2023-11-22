package com.emanuel.employeeapp.mapper;

import com.emanuel.employeeapp.dtos.EmployeeDto;
import com.emanuel.employeeapp.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeDto toEmployeeDto(Employee employee);

}
