package com.example.udemy_rest_api.controller;


import com.example.udemy_rest_api.entity.Student;
import com.example.udemy_rest_api.request.CreateStudentRequest;
import com.example.udemy_rest_api.request.UpdateStudentRequest;
import com.example.udemy_rest_api.response.StudentResponse;

import com.example.udemy_rest_api.service.StudentService;
import jakarta.validation.Valid;
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
    //@Valid - All fields must be valid, or when the request is sent to the api it will return an error. User must insert all data!.
    public StudentResponse createStudent(@Valid @RequestBody CreateStudentRequest createStudentRequest){
        Student student = studentService.createStudent(createStudentRequest);

        return new StudentResponse(student);
    }

    //http://localhost:8080/api/student/update
    //the id needs to be passed in the json payload
    @PutMapping("/update")
    public StudentResponse updateStudent(@Valid @RequestBody UpdateStudentRequest updateStudentRequest){
        Student student = studentService.updateStudent(updateStudentRequest);
        return new StudentResponse(student);
    }


    /*
    @DeleteMapping("/delete")
    //the @requestParam annotation will take the id from the request {url /delete/?id=1} and assign the var id to the int in the url
    public String deleteStudent(@RequestParam long id){
        return studentService.deleteStudent(id);
    }*/

    //You can choose which method to use to delete a record in the db
    //PathVariable way
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable long id){
        return studentService.deleteStudent(id);
    }

    @GetMapping("/getByFirstName/{firstName}")
    public List<StudentResponse> getByFirstName(@PathVariable String firstName) {
        //The return type will be a list of studentResponse, so this is the model class we have to retrieve the information for the student. Will return a list of student
        List<Student> studentList = studentService.getByFirstName(firstName);

        //THIS CODE JUST CONVERTS LIST OF STUDENT TO LIST OF STUDENTRESPONSE. IT IS A SAFETY CLASS THAT IS USED SO YOU DO NOT DIRECTLY EXPOSE YOUR ENTITY CLASS
        List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();

        studentList.stream().forEach(student -> {
            studentResponseList.add(new StudentResponse(student));
        });

        return studentResponseList;
        ///////////////////////////
    }

    @GetMapping("/getByLastName/{lastName}")
    public List<StudentResponse> getByLastName(@PathVariable String lastName){
        List<Student> studentList = studentService.getByLastName(lastName);

        //THIS CODE JUST CONVERTS LIST OF STUDENT TO LIST OF STUDENTRESPONSE. IT IS A SAFETY CLASS THAT IS USED SO YOU DO NOT DIRECTLY EXPOSE YOUR ENTITY CLASS
        List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();

        studentList.stream().forEach(student -> {
            studentResponseList.add(new StudentResponse(student));
        });

        return studentResponseList;
    }

    @GetMapping("/getByEmail/{email}")
    public List<StudentResponse> getByEmail(@PathVariable String email){
        List<Student> studentList = studentService.getByEmail(email);

        //THIS CODE JUST CONVERTS LIST OF STUDENT TO LIST OF STUDENTRESPONSE. IT IS A SAFETY CLASS THAT IS USED SO YOU DO NOT DIRECTLY EXPOSE YOUR ENTITY CLASS
        List<StudentResponse> studentResponseList = new ArrayList<StudentResponse>();

        studentList.stream().forEach(student -> {
            studentResponseList.add(new StudentResponse(student));
        });

        return studentResponseList;
    }



}


