package com.example.hms.demohotelmanagement.Repository;

import com.example.hms.demohotelmanagement.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
