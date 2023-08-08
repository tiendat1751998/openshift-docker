package com.datdev.docker.dto;


import com.datdev.docker.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private  Long id;
    private String fullName;
    private String dateOfBirth;
    private String hometown;
    private Gender gender;
}

