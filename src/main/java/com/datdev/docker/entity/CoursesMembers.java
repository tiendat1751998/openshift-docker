package com.datdev.docker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses_members")
public class CoursesMembers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "member_id")
    private Long memberId;

    public CoursesMembers(Long courseId, Long memberId) {
        this.courseId = courseId;
        this.memberId = memberId;
    }
}
