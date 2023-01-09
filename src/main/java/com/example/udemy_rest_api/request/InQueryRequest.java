package com.example.udemy_rest_api.request;

import lombok.Data;

import java.util.List;

@Data
public class InQueryRequest {
    private List<String> firstNames;
    // in this model class we have a List of firstNames that correspond to the IN query for searching firstNames in the db
    //see lecture 42 IN Query using JPA
}
