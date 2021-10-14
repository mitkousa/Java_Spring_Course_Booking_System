package com.booking_system.example.demo.repositories;

import com.booking_system.example.demo.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByStarRating(int starRating);
    List<Course> findByBookingsCustomerNameIgnoreCase(String name);
    }

