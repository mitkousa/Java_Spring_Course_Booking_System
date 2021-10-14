package com.booking_system.example.demo.repositories;

import com.booking_system.example.demo.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
