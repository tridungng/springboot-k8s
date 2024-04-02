package com.bbyoda.course;

public interface ICourseService {
  CourseDetail getCourseDetailBy(Long courseId);
  CourseDetail joinCourse(JoinCourseReq req);

}
