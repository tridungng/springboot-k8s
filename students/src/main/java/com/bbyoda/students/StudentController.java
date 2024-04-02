package com.bbyoda.students;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/students")
public class StudentController {
  private final StudentService studentService;

  @PostMapping
  public ResponseEntity<StudentDto> createStudent(@RequestBody CreateStudentRequest request) {
    return new ResponseEntity<>(studentService.createStudent(request), HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<StudentDto>> getAllStudents() {
    return new ResponseEntity<>(studentService.getAll(), HttpStatus.OK);
  }
}
