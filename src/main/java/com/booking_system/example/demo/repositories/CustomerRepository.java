package com.booking_system.example.demo.repositories;

import com.booking_system.example.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByBookingsCourseName(String course);
    List<Customer> findByBookingsCourseNameAndTown(String town, String course);
}
