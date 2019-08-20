package com.example.hms.demohotelmanagement.Repository;

import com.example.hms.demohotelmanagement.Model.Promotions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionsRepository extends JpaRepository<Promotions,Long> {
}
