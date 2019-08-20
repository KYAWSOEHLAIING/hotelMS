package com.example.hms.demohotelmanagement.Repository;

import com.example.hms.demohotelmanagement.Model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
