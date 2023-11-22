package com.emanuel.employeeapp.controllers;

import com.emanuel.employeeapp.dtos.EmployeeDto;
import com.emanuel.employeeapp.entity.Employee;
import com.emanuel.employeeapp.mapper.EmployeeMapper;
import com.emanuel.employeeapp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RequiredArgsConstructor
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> getById(@PathVariable("id") Long id) {
        EmployeeDto employeeDto = employeeService.findById(id);
        return ResponseEntity.ok(employeeDto);
    }

    @PostMapping("/register")
    public ResponseEntity<EmployeeDto> register(@RequestBody Employee employee) {
        EmployeeDto employeeDto = employeeService.register(employee);
        return ResponseEntity.created(URI.create("/employees" + employeeDto.getId())).body(employeeDto);

    }


}
