package com.example.udemy_rest_api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @GetMapping("getAddress")
    public String getAddress(){

        Logger logger = LoggerFactory.getLogger(AddressController.class);
        logger.error("Inside Error");
        logger.warn("Inside Warning");
        logger.info("Inside Info");
        logger.debug("Inside debug");
        logger.trace("Inside trace");

        return "This is address of student";
    }


}
