package com.emanuel.addressservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdressControllerr {

    @GetMapping("/address")
    public String getAdress(){
        return "1 Chome-1-2 Oshiage, Sumida City, Tokyo 131-0045, Japão";
    }

}
