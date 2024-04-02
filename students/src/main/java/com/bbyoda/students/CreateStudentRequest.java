package com.bbyoda.students;

import lombok.Data;

@Data
public class CreateStudentRequest {
  private String fullName;

  private String dateOfBirth;

  private String homeTown;

  private Gender gender;
}
