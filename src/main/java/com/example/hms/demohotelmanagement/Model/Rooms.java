package com.example.hms.demohotelmanagement.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomsNumber;
    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus;
    @ManyToOne
    private Promotions promotions;
    @ManyToOne
    private Booking booking;

    public Rooms(String roomsNumber, RoomType roomType, RoomStatus roomStatus, Promotions promotions, Booking booking) {
        this.roomsNumber = roomsNumber;
        this.roomType = roomType;
        this.roomStatus = roomStatus;
        this.promotions = promotions;
        this.booking = booking;
    }
}
