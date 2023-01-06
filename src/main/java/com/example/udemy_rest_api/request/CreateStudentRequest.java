package com.example.udemy_rest_api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateStudentRequest {
    //private String id;

    @JsonProperty("first_name")
    @NotBlank(message = "First name is required") //if the firstName value is not valid (i.e. It has no value). When sent the request will return am error
    private String firstName;

    private String lastName;

    private String email;

}