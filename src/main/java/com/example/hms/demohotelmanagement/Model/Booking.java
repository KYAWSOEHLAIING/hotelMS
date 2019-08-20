package com.example.hms.demohotelmanagement.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookingNumber;
    private int numbersOfAdults;
    private int numberOfChildren;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fromStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate toEnd;
    private Boolean bookingCancelled;
    private double inAdvace;
    private double fullCharges;
    @ManyToOne
    private UserProfile userProfile;

    public Booking(String bookingNumber, int numbersOfAdults, int numberOfChildren, LocalDate fromStart, LocalDate toEnd, Boolean bookingCancelled, double inAdvace,
                   double fullCharges, UserProfile userProfile) {
        this.bookingNumber = bookingNumber;
        this.numbersOfAdults = numbersOfAdults;
        this.numberOfChildren = numberOfChildren;
        this.fromStart = fromStart;
        this.toEnd = toEnd;
        this.bookingCancelled = bookingCancelled;
        this.inAdvace = inAdvace;
        this.fullCharges = fullCharges;
        this.userProfile = userProfile;
       }
}
