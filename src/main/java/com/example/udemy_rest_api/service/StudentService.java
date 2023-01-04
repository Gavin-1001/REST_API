package com.example.udemy_rest_api.service;

import com.example.udemy_rest_api.entity.Student;
import com.example.udemy_rest_api.repository.StudentRepository;
import com.example.udemy_rest_api.request.CreateStudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

/*    public Student createStudent(CreateStudentRequest createStudentRequest){
        Student student = new Student(createStudentRequest);
        student = studentRepository.save(student);
        return student;
        //Save - Whatevey entity class you provided, the object will be persisted in the db table. It will create a new record in the student table
    }*/

    public Student createStudent (CreateStudentRequest createStudentRequest) {
        Student student = new Student(createStudentRequest);

        student = studentRepository.save(student);
        return student;
    }
}
