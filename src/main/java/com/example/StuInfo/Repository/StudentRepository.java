package com.example.StuInfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StuInfo.Entity.StudentEntity;



public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
