package com.datdev.docker.controller;

import com.datdev.docker.dto.StudentDTO;
import com.datdev.docker.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/students")
public class StudentControllers {

    private final IStudentService iStudentService;

    public StudentControllers(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @PostMapping
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO request) {
        return new ResponseEntity<>(iStudentService.createStudent(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getAllStudents() {
        return new ResponseEntity<>(iStudentService.getAll(), HttpStatus.OK);
    }
}
