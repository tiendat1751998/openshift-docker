///*
//package com.datdev.docker.controller;
//
//import com.datdev.docker.dto.CoursesDTO;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value = "/api/courses")
//public class CoursesControllers {
//
//    private final ICoursesService iCoursesService;
//
//    public CoursesControllers(ICoursesService iCoursesService) {
//        this.iCoursesService = iCoursesService;
//    }
//
//    @PostMapping(value = "/v1/createCourse")
//    public ResponseEntity<BaseResponse<CoursesDTO>> createCourse(@RequestBody CoursesDTO coursesDTO) {
//        return new ResponseEntity<>(BaseResponse.buildSuccessResp(iCoursesService.createCourse(coursesDTO)), HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/v1/joinCourse")
//    public ResponseEntity<BaseResponse<CourseDto>> joinCourse(@RequestBody JoinCourseReq req) {
//        return new ResponseEntity<>(BaseResponse.buildSuccessResp(iCoursesService.joinCourse(req)), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/v1/getCourseDetailBy")
//    public ResponseEntity<BaseResponse<CourseDetail>> getCourseDetailBy(@RequestParam(name = "courseId") Long courseId) {
//        return new ResponseEntity<>(BaseResponse.buildSuccessResp(iCoursesService.getCourseDetailBy(courseId)), HttpStatus.OK);
//    }
//}
//*/
