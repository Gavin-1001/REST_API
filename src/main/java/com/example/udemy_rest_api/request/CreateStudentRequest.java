package com.example.udemy_rest_api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateStudentRequest {
    //private String id;

    @JsonProperty("first_name")
    private String firstName;

    private String lastName;

    private String email;

}
