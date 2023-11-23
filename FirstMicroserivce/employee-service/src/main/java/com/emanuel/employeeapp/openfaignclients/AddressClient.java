package com.emanuel.employeeapp.openfaignclients;

import com.emanuel.employeeapp.dtos.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address", url = "http://localhost:8082/")
public interface AddressClient {

@GetMapping("/address/{employeeId}")
public ResponseEntity<AddressDto> getAddressByEmployeeId(@PathVariable("employeeId") Long id);
}
