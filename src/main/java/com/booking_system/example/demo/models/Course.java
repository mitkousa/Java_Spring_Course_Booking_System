package com.booking_system.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String date;
    private String town;
    private int starRating;
    private List<Booking> bookings;

    public Course(String date, String town, int starRating) {
        this.date = date;
        this.town = town;
        this.starRating = starRating;
        this.bookings = new ArrayList<>();
    }

    public Course() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public  void addBooking(Booking booking){
        this.bookings.add(booking);
    }
}
