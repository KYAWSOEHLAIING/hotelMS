package com.example.hms.demohotelmanagement.Repository;

import com.example.hms.demohotelmanagement.Model.MenuBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuBookingRepository extends JpaRepository<MenuBookings,Long> {
}
