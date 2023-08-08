package com.datdev.docker.respository;

import com.datdev.docker.entity.CoursesMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICoursesMembersRepository extends JpaRepository<CoursesMembers,Long> {
}
