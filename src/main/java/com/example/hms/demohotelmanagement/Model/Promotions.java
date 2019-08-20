package com.example.hms.demohotelmanagement.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Promotions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String seasonal;
    private String packagePromotion;
    //percent
    private double discount;

    private String service;

    public Promotions(String seasonal, String packagePromotion, double discount, String service) {
        this.seasonal = seasonal;
        this.packagePromotion = packagePromotion;
        this.discount = discount;
        this.service = service;
    }
}
