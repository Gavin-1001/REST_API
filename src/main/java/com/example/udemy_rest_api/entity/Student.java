package com.example.udemy_rest_api.entity;

import com.example.udemy_rest_api.request.CreateStudentRequest;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Table(name="student_table")
@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="_id")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="_email")
    private String email;

    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;

    @Transient //is ignored by database, no need to create a new column to store the data
    private String fullName;

    public Student (CreateStudentRequest createStudentRequest) {
        this.firstName = createStudentRequest.getFirstName();
        this.lastName = createStudentRequest.getLastName();
        this.email = createStudentRequest.getEmail();
        //this.fullName = createStudentRequest.getFirstName() + " " +createStudentRequest.getLastName();
    }



}


