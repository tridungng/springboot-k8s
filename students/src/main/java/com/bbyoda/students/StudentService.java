package com.bbyoda.students;

import java.util.List;

public interface StudentService {
  List<StudentDto> getAll();
  StudentDto createStudent(CreateStudentRequest request);
}
