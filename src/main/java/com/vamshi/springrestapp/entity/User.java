package com.vamshi.springrestapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="First_Name",nullable = false)
    private String firstName;
    @Column(name="Last_Name", nullable=false)
    private String lastName;
    @Column(name="eMail",nullable=false )
    private String email;
}
