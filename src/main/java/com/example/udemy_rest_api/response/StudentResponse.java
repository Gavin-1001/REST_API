package com.example.udemy_rest_api.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class StudentResponse {

    @JsonIgnore
    private long id;

    @JsonProperty("first_name")
    private String firstName;

    private String lastName;

}
