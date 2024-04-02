package com.bbyoda.course;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CourseController {
  private final ICourseService courseService;


}
