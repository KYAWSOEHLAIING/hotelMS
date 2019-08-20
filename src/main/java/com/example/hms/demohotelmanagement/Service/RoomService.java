package com.example.hms.demohotelmanagement.Service;

import com.example.hms.demohotelmanagement.Model.Rooms;

import java.util.List;

public interface RoomService {
    Rooms create(Rooms rooms);
    Rooms findById(long id);
    List<Rooms> findAll();
}
