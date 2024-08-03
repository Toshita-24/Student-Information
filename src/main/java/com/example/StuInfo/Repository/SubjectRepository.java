package com.example.StuInfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StuInfo.Entity.SubjectEntity;



public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
}