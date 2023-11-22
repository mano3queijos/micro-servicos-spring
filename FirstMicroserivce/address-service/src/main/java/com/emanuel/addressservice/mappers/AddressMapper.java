package com.emanuel.addressservice.mappers;

import com.emanuel.addressservice.dtos.AddressDTO;
import com.emanuel.addressservice.entities.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDTO toAddressDto(Address address);

}
