package com.bbyoda.course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseMemberRepository extends JpaRepository<CourseDetail, Long> {}
