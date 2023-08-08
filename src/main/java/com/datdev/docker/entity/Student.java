package com.datdev.docker.entity;

import com.datdev.docker.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.datdev.docker.enums.Gender;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "dob")
    private String dateOfBirth;

    @Column(name = "hometown")
    private String hometown;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public static Student createFrom(StudentDTO request) {
        Student student = new Student();
        student.setFullName(request.getFullName());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setHometown(request.getHometown());
        student.setGender(request.getGender());
        return student;
    }
}