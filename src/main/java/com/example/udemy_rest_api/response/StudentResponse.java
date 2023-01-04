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

    public StudentResponse(Student student){
        //you don't want the id displayed in the json data
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
        this.email = student.getEmail();
    }

}
