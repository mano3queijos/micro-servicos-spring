package com.emanuel.addressservice.services;

import com.emanuel.addressservice.dtos.AddressDTO;
import com.emanuel.addressservice.entities.Address;
import com.emanuel.addressservice.exceptions.AppException;
import com.emanuel.addressservice.mappers.AddressMapper;
import com.emanuel.addressservice.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AddressService {


    @Autowired
    private AddressMapper addressMapper;


    private final AddressRepository addressRepository;

    public AddressDTO findAddressByEmployeeId(Long id) {

        return addressMapper.toAddressDto(addressRepository.findAddressByEmployeeId(id).orElseThrow(() -> new AppException("", HttpStatus.NOT_FOUND)));
    }


    public AddressDTO register(Address addressDto) {

        Address savedAddress = addressRepository.save(addressDto);
        System.out.println(savedAddress);
        AddressDTO addressDTO = addressMapper.toAddressDto(savedAddress);
        System.out.println(addressDTO);
        return addressDTO;
    }


}
