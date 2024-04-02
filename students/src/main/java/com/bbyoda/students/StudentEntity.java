package com.bbyoda.students;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class StudentEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "full_name")
  private String fullName;

  @Column(name = "date_of_birth")
  private String dateOfBirth;

  @Column(name = "home_town")
  private String homeTown;

  @Column(name = "gender")
  @Enumerated(value = EnumType.STRING)
  private Gender gender;

  public static StudentEntity createFrom(CreateStudentRequest request) {
    StudentEntity studentEntity = new StudentEntity();
    studentEntity.setGender(request.getGender());
    studentEntity.setFullName(request.getFullName());
    studentEntity.setDateOfBirth(request.getDateOfBirth());
    studentEntity.setHomeTown(request.getHomeTown());
    return studentEntity;
  }
}
