package com.example.udemy_rest_api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="address")

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;
}
