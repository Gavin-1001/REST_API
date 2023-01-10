package com.example.udemy_rest_api.response;

import com.example.udemy_rest_api.entity.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;



@Data

public class StudentResponse {

    //@JsonIgnore
    private long id;

    @JsonProperty("first_name")
    private String firstName;

//    @JsonProperty("last_name")
    private String lastName;

//    @JsonProperty("_email")
    private String email;

    private String fullName;
    //when GETting all student records /getAll it will return student firstName and lastName concatenated
    //when POSTing data the payload sent will contain the fullName variable in the sent data
    public StudentResponse(Student student){
        //you don't want the id displayed in the json data
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
        this.fullName = student.getFirstName() + " " + student.getLastName();
    }

}
