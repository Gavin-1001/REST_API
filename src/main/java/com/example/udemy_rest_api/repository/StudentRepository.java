package com.example.udemy_rest_api.repository;

import com.example.udemy_rest_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);

    List<Student> findByLastName(String lastName);

    List<Student> findByEmail(String email);

    //returns just one Student object
    Student findByFirstNameAndLastName(String firstName, String lastName);
    //jpa will create a query where it checks for the firstName AND the lastName

    List<Student> findByFirstNameOrLastName(String firstName, String lastName);

}
