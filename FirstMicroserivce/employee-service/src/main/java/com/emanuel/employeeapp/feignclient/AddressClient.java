package com.emanuel.employeeapp.feignclient;

import com.emanuel.employeeapp.dtos.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "address", url = "http://localhost:8081/")
public interface AddressClient {

    @GetMapping("/address/{id}")
    AddressDto getAddressByEmployeeId(@PathVariable("id") Long id);
}