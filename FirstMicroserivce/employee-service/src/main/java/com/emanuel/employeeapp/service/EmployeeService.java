package com.emanuel.employeeapp.service;

import com.emanuel.employeeapp.dtos.AddressDto;
import com.emanuel.employeeapp.dtos.EmployeeDto;
import com.emanuel.employeeapp.entity.Employee;
import com.emanuel.employeeapp.dtos.exception.AppException;
import com.emanuel.employeeapp.mapper.EmployeeMapper;
import com.emanuel.employeeapp.openfaignclients.AddressClient;
import com.emanuel.employeeapp.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeService {
//
//    @Autowired
//    private AddressClient addressClient;

    private final EmployeeMapper employeeMapper;
    private final EmployeeRepository employeeRepository;
@Autowired
private AddressClient addressClient;
    public EmployeeDto findById(Long id) {

        ResponseEntity<AddressDto> addressDtoResponseEntity = addressClient.getAddressByEmployeeId(id);
        AddressDto addressDto = addressDtoResponseEntity.getBody();

        Employee savedEmployee = employeeRepository.findById(id).orElseThrow(() -> new AppException("", HttpStatus.NOT_FOUND));
        EmployeeDto employeeDto = employeeMapper.toEmployeeDto(savedEmployee);

        employeeDto.setAddressDto(addressDto);
        return employeeDto;

    }

    public EmployeeDto register(Employee employeeDto) {
        Employee savedEmployee = employeeRepository.save(employeeDto);
        return employeeMapper.toEmployeeDto(savedEmployee);
    }

}
