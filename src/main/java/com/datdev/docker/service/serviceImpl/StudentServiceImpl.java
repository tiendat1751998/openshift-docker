package com.datdev.docker.service.serviceImpl;

import com.datdev.docker.dto.StudentDTO;
import com.datdev.docker.entity.Student;
import com.datdev.docker.respository.IStudentRepository;
import com.datdev.docker.service.IStudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final IStudentRepository iStudentRepository;

    public StudentServiceImpl(IStudentRepository iStudentRepository) {
        this.iStudentRepository = iStudentRepository;
    }

    @Override
    public StudentDTO createStudent(StudentDTO request) {
        Student student = iStudentRepository.save(Student.createFrom(request));
        return objectMapper.convertValue(student, StudentDTO.class);
    }

    @Override
    public List<StudentDTO> getAll() {
        List<Student> students = iStudentRepository.findAll();
        List<StudentDTO> studentRespList = new ArrayList<>();
        for (Student student : students) {
            StudentDTO studentResp = objectMapper.convertValue(student, StudentDTO.class);
            studentRespList.add(studentResp);
        }
        return studentRespList;
    }
}
