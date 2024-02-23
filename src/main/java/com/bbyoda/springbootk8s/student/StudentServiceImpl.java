package com.bbyoda.springbootk8s.student;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
  private static final ObjectMapper MAPPER = new ObjectMapper();
  private final StudentRepository studentRepository;
  @Override
  public List<StudentDto> getAll() {
    Collection<StudentEntity> studentEntities = studentRepository.findAll();
    List<StudentDto> studentDtos = new ArrayList<>();
    for(StudentEntity studentEntity : studentEntities) {
      StudentDto dto = MAPPER.convertValue(studentEntity, StudentDto.class);
      studentDtos.add(dto);
    }

    return studentDtos;
  }

  @Override
  public StudentDto createStudent(CreateStudentRequest request) {
    StudentEntity studentEntity = studentRepository.save(StudentEntity.createFrom(request));
    return MAPPER.convertValue(studentEntity, StudentDto.class);
  }
}
