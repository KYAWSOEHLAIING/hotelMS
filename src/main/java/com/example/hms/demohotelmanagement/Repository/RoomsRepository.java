package com.example.hms.demohotelmanagement.Repository;

import com.example.hms.demohotelmanagement.Model.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends JpaRepository<Rooms,Long> {
}
