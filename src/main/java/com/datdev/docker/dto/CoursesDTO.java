package com.datdev.docker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursesDTO {
    private Long id;
    private String name;
    private String desc;
    private String author;
}
