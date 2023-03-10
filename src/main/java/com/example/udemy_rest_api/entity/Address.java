package com.example.udemy_rest_api.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
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

    //@OneToOne(mappedBy = "address")
    @OneToOne(mappedBy = "address")
    private Student student;
    //make the relationship OneToOne bidirectional
}
