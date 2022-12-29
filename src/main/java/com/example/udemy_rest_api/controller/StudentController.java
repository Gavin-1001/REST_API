package com.example.udemy_rest_api.controller;

import com.example.udemy_rest_api.entity.Student;
import com.example.udemy_rest_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RESTCONTROLLER = combination of @Controller and @ResponseBody annotations. Otherwise, we would need to put a @Controller on the top of the class
//and @RepsonseBody on each method/api that we develop.

@RequestMapping("/api/student/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


}
