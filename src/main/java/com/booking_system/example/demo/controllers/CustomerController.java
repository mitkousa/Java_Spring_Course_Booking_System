package com.booking_system.example.demo.controllers;

import com.booking_system.example.demo.models.Course;
import com.booking_system.example.demo.models.Customer;
import com.booking_system.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getCustomers(
            @RequestParam(name = "course", required = false) String course,
            @RequestParam(name = "town", required = false) String town,
            @RequestParam(name = "name", required = false) String name
    ) {
        if(course != null){
            return new ResponseEntity<>(customerRepository.findByBookingsCourseName(course), HttpStatus.OK);
        } if (town != null && course !=null){
            return new ResponseEntity<>(customerRepository.findByBookingsCourseNameAndTown(course, town),
                    HttpStatus.OK);
        }
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }
}
