package com.bbyoda.students;

import lombok.Data;

@Data
public class StudentDto {
  private Long id;

  private String fullName;

  private String dateOfBirth;

  private String homeTown;

  private Gender gender;
}
