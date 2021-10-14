package com.booking_system.example.demo.repositories;

import com.booking_system.example.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
