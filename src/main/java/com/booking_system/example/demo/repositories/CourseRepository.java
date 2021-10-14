package com.booking_system.example.demo.repositories;

import com.booking_system.example.demo.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
