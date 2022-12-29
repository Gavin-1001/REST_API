package com.example.udemy_rest_api.service;

import com.example.udemy_rest_api.entity.Student;
import com.example.udemy_rest_api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
//business logic is performed in here such as DB QUERIES, Crud operations

    //write query to get all student records from DB

    //gives us an instance of student repository
    @Autowired
    StudentRepository studentRepository;


    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }

}
