package com.datdev.docker.respository;

import com.datdev.docker.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICoursesRepository extends JpaRepository<Courses,Long> {
}
