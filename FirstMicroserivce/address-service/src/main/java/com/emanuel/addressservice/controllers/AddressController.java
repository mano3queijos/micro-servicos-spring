package com.emanuel.addressservice.controllers;

import com.emanuel.addressservice.dtos.AddressDTO;
import com.emanuel.addressservice.entities.Address;
import com.emanuel.addressservice.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RequiredArgsConstructor
@RestController
public class AddressController {


    private final AddressService addressService;


    @GetMapping("/address/{employeeId}")
    public ResponseEntity<AddressDTO> findAddressByiD(@PathVariable Long employeeId) {

        AddressDTO addressDTO = addressService.findAddressByEmployeeId(employeeId);

        return ResponseEntity.ok(addressDTO);
    }
    @PostMapping("/register")
    public ResponseEntity<AddressDTO> register(@RequestBody Address address) {
        AddressDTO addressDTO = addressService.register(address);
        return ResponseEntity.created(URI.create("/addresses/" + addressDTO.getId())).body(addressDTO);

    }




}
