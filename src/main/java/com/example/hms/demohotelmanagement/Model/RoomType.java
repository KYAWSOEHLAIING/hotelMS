package com.example.hms.demohotelmanagement.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public enum  RoomType {
    Delux("3 persons",200000),
    Luxury("3 persons",300000),
    Economy("3 persons",300000),
    ExtraBed("3 persons",300000),
    ;

    RoomType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String name;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
