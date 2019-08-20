package com.example.hms.demohotelmanagement.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class MenuBookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ElementCollection
    private List<String> reserveList = new ArrayList<>();
    @ElementCollection
    private List<String> freeReserveList = new ArrayList<>();
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dailyReserve;

    @ManyToOne
    private Rooms rooms;
    @ManyToOne
    private Promotions promotions;
    @ManyToOne
    private Booking bookings;

    public MenuBookings(List<String> reserveList, List<String> freeReserveList, LocalDate dailyReserve) {
        this.reserveList = reserveList;
        this.freeReserveList = freeReserveList;
        this.dailyReserve = dailyReserve;
    }
}
