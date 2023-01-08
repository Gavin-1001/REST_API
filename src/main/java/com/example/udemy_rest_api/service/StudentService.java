package com.example.udemy_rest_api.service;

import com.example.udemy_rest_api.entity.Student;
import com.example.udemy_rest_api.repository.StudentRepository;
import com.example.udemy_rest_api.request.CreateStudentRequest;
import com.example.udemy_rest_api.request.UpdateStudentRequest;
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

    public Student updateStudent(UpdateStudentRequest updateStudentRequest){
        Student student = studentRepository.findById(updateStudentRequest.getId()).get();
        if(updateStudentRequest.getFirstName()!= null && !updateStudentRequest.getFirstName().isEmpty()){
            student.setFirstName(updateStudentRequest.getFirstName());
        }
        if(updateStudentRequest.getLastName()!= null && !updateStudentRequest.getLastName().isEmpty()){
            student.setLastName(updateStudentRequest.getLastName());
        }
        if(updateStudentRequest.getEmail()!= null && !updateStudentRequest.getEmail().isEmpty()){
            student.setEmail(updateStudentRequest.getEmail());
        }

        student = studentRepository.save(student);
        return student;
    }

    /* path for query reference http://localhost:8080/api/student/delete?id=2
    public String deleteStudent(long id){
        studentRepository.deleteById(id);
        return "Student has been deleted successfully";
    }
    */

    public String deleteStudent(long id){
        studentRepository.deleteById(id);
        return "Student has been deleted successfully";
    }



    public List<Student> getByFirstName(String firstName){
        //We are using a List because if there is for example more than one record where the record has the same firstName
        //this returns a list of student

        //call the repository
        return studentRepository.findByFirstName(firstName);
    }

    public List<Student> getByLastName(String lastName){
        return studentRepository.findByLastName(lastName);
    }

    public List<Student> getByEmail(String email){
        return studentRepository.findByEmail(email);
    }

    public Student getByFirstNameAndLastName(String firstName, String lastName){
        return studentRepository.findByFirstNameAndLastName(firstName, lastName);
    }


}
