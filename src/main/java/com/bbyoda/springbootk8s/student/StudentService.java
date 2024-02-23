package com.bbyoda.springbootk8s.student;

import java.util.List;

public interface StudentService {
  List<StudentDto> getAll();
  StudentDto createStudent(CreateStudentRequest request);
}
