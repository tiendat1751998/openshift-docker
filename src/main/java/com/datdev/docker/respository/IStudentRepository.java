package com.datdev.docker.respository;

import com.datdev.docker.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
