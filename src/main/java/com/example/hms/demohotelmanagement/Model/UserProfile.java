package com.example.hms.demohotelmanagement.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String emial;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToMany
    private List<Role> roles = new ArrayList<>();

    public void addRole(Role role){
        roles.add(role);
    }

    public void addRoles(ArrayList<Role> list){
        roles.addAll(list);
    }

    public UserProfile(String firstName, String lastName, String emial, String phoneNumber, Gender gender, List<Role> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emial = emial;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.roles = roles;
    }
}
