package com.microservice.Hotelservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

public class StaffController {
    @GetMapping
    public ResponseEntity<List<String>> getStaffs() {
        List<String> list = Arrays.asList("Ram", "Shyam", "Sita", "Krishna");
        return new ResponseEntity<>(list, HttpStatus.OK);
}
}