package com.example.udemy_rest_api.request;


import lombok.Data;

@Data
public class CreateSubjectRequest {

    private String subjectName;

    private Double marksObtained;

}
