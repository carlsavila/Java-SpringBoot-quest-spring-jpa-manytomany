package com.wildcodeschool.wildandwizard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.wildandwizard.entity.WizardCourse;

@Repository
public interface WizardCourseRespository extends JpaRepository<WizardCourse, Long> {

}
