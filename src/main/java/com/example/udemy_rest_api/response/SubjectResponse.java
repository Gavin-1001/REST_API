package com.example.udemy_rest_api.response;

import com.example.udemy_rest_api.entity.Subject;
import lombok.Data;

@Data
public class SubjectResponse {
//model class for SubjectResponse
    private Long id;

    private String subjectName;

    private Double marksObtained;

    public SubjectResponse(Subject subject){
        this.id = subject.getId();
        this.subjectName = subject.getSubjectName();
        this.marksObtained = subject.getMarksObtained();
    }

}
