package com.geekster.DoctorApplication.dao;

import com.geekster.DoctorApplication.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
}