package com.example.udemy_rest_api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity


@Table(name="student_table")
public class Student {

    @Id
    @Column(name="id")
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="first_name")
    @JsonProperty("first_name")
    private String firstName;

    @Column(name="last_name")
    @JsonProperty("last_name")
    private String lastName;

    @Column(name="email")
    @JsonProperty("_email")
    private String email;

    public Student() {
    } //added NoArgsConstructor annotation. So there is no need for a constructor


    public Student(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }




}
