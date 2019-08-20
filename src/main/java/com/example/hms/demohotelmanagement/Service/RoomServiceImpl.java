package com.example.hms.demohotelmanagement.Service;

import com.example.hms.demohotelmanagement.Model.Rooms;
import com.example.hms.demohotelmanagement.Repository.RoomsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomsRepository roomsRepository;

    public RoomServiceImpl(RoomsRepository roomsRepository) {
        this.roomsRepository = roomsRepository;
    }


    @Override
    public Rooms create(Rooms rooms) {
        return this.roomsRepository.save(rooms);
    }

    @Override
    public Rooms findById(long id) {
        return this.roomsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Rooms> findAll() {
        return this.roomsRepository.findAll();
    }
}
