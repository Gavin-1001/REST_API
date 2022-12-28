package com.example.udemy_rest_api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
//@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @JsonIgnore //can be used to hide the id from the json get request. Can be used on any property in the class
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //@JsonProperty("first_name") change the key in the json request
    private String firstName;

    //@JsonProperty("last_name")change the key in the json request
    private String lastName;

    /*
    public Student() {
    } added NoArgsConstructor annotation. So there is no need for a constructor
     */

    public Student(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
