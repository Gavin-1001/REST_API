package com.example.udemy_rest_api.controller;


import com.example.udemy_rest_api.entity.Student;
import com.example.udemy_rest_api.request.CreateStudentRequest;
import com.example.udemy_rest_api.response.StudentResponse;

import com.example.udemy_rest_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RESTCONTROLLER = combination of @Controller and @ResponseBody annotations. Otherwise, we would need to put a @Controller on the top of the class
//and @RepsonseBody on each method/api that we develop.

@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getAll")
    public List<StudentResponse> getAllStudents(){
        List<Student> studentList = studentService.getAllStudent();
        List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();

        studentList.stream().forEach(student -> {
            studentResponseList.add(new StudentResponse(student));
        });

        return studentResponseList;
    }


    @PostMapping("/create") //the createStudentRequest converts the json payload in the class
    public StudentResponse createStudent(@RequestBody CreateStudentRequest createStudentRequest){
        Student student = studentService.createStudent(createStudentRequest);

        return new StudentResponse(student);
    }
}
