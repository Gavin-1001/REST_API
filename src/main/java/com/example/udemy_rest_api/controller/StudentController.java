package com.example.udemy_rest_api.controller;

import com.example.udemy_rest_api.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RESTCONTROLLER = combination of @Controller and @ResponseBody annotations. Otherwise, we would need to put a @Controller on the top of the class
//and @RepsonseBody on each method/api that we develop.

@RequestMapping("/api/student/")
public class StudentController {

    @GetMapping("/get")
    //@RequestMapping(value = "/get", method = RequestMethod.GET). This annotation can be used, but it is easier to use @GETMAPPING. You know it is a get request
    public Student getStudent() {
        Student student = new Student(1, "John", "Smith");
        return student;
    }




}
