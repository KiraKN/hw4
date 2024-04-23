package com.kirakn.hw4;

import java.io.Serializable;

public class BusTicket implements Serializable {
    private int userId;
    private String departureTime;
    private String arrivalTime;
    private int seatNumber;
    private double ticketPrice;

    public BusTicket(int userId, String departureTime, String arrivalTime, int seatNumber, double ticketPrice) {
        this.userId = userId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }

    public int getUserId() {
        return userId;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
