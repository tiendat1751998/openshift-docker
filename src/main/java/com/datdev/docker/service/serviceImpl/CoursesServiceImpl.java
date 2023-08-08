//package com.datdev.docker.service.serviceImpl;
//
//import com.datdev.docker.dto.CoursesDTO;
//import com.datdev.docker.entity.Courses;
//import com.datdev.docker.respository.ICoursesMembersRepository;
//import com.datdev.docker.respository.ICoursesRepository;
//import com.datdev.docker.service.ICoursesService;
//import com.datdev.docker.service.IStudentService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@AllArgsConstructor
//public class CoursesServiceImpl implements ICoursesService {
//
//    private final ObjectMapper objectMapper;
//    private final IStudentService iStudentService;
//    private final ICoursesRepository iCoursesRepository;
//    private final ICoursesMembersRepository iCoursesMembersRepository;
//
//    @Override
//    public CoursesDTO createCourse(CoursesDTO req) {
//        Courses courses = new Courses();
//        courses.setName(req.getName());
//        courses.setAuthor(req.getAuthor());
//        courses.setDesc(req.getDesc());
//        Courses coursesDB = iCoursesRepository.save(courses);
//        return objectMapper.convertValue(coursesDB, CourseDto.class);
//    }
//
//    @Override
//    public CourseDetail getCourseDetailBy(Long courseId) {
//        CourseDetail courseDetail = new CourseDetail();
//        Courses courses = iCoursesRepository.findByID(courseId);
//        if (Objects.isNull(courses)) {
//            throw new CustomException("Courses not found!");
//        }
//        List<Long> membersId = new ArrayList<>();
//        List<CoursesMembers> membersOfCourse = iCoursesMembersRepository.getAllById(courseId);
//        for (CoursesMembers member : membersOfCourse) {
//            membersId.add(member.getMemberId());
//        }
//        if (!membersId.isEmpty()) {
//            GetStudentsByIdsResp studentsResp = iStudentClient.getStudentsByIds(new GetStudentsByIdsReq(membersId));
//            List<MemberInfo> membersInfo = studentsResp.getStudents().stream()
//                    .map(studentDTO -> objectMapper.convertValue(studentDTO, MemberInfo.class))
//                    .collect(Collectors.toList());
//
//            courseDetail.setMembers(membersInfo);
//        }
//        courseDetail.setCourse(objectMapper.convertValue(courses, CourseDto.class));
//        return courseDetail;
//    }
//
//    @Override
//    public CoursesDTO joinCourse(CoursesDTO coursesDTO) {
//        Courses courses = iCoursesRepository.findByID(coursesDTO.getCourseId());
//        if (Objects.isNull(courses)) {
//            throw new CustomException("Courses not found!");
//        }
//        StudentDTO studentDetail = iStudentClient.getStudentById(coursesDTO.getStudentId());
//        if (Objects.isNull(studentDetail)) {
//            throw new CustomException("Student not found!");
//        }
//        CoursesMembers coursesMember = new CoursesMembers(courses.getId(), studentDetail.getId());
//        iCoursesMembersRepository.save(coursesMember);
//        return objectMapper.convertValue(courses, CourseDto.class);
//    }
//}
