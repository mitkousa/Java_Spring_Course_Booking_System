package com.booking_system.example.demo.components;

import com.booking_system.example.demo.models.Booking;
import com.booking_system.example.demo.models.Course;
import com.booking_system.example.demo.models.Customer;
import com.booking_system.example.demo.repositories.BookingRepository;
import com.booking_system.example.demo.repositories.CourseRepository;
import com.booking_system.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Woodie", "Edinburgh", 54);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Sandi", "Glasgow", 38);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Abigail", "Inverness", 22);
        customerRepository.save(customer3);
        Course course1 = new Course("PingPong", "55/55/55", "Edinburgh", 5);
        courseRepository.save(course1);
        Course course2 = new Course("Aribaa", "66/66/66", "Tortuga", 6);
        courseRepository.save(course2);
        Booking booking1 = new Booking("22/22/22", customer1, course1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("11/11/11", customer2, course1);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("33/33/33", customer3, course2);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("44/44/44", customer1, course2);
        bookingRepository.save(booking4);
    }
}
