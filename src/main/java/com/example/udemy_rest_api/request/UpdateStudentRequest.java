package com.example.udemy_rest_api.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateStudentRequest {

    //model class for updating api
    @NotNull(message = "Student Id is required")
    private Long id;

    private String firstName;

    private String lastName;

    private String email;
}
