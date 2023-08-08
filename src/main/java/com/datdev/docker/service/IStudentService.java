package com.datdev.docker.service;

import com.datdev.docker.dto.StudentDTO;

import java.util.List;

public interface IStudentService {
    public StudentDTO createStudent(StudentDTO request);
    public List<StudentDTO> getAll();
}
