package com.example.StuInfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StuInfo.Entity.SubjectEntity;
import com.example.StuInfo.Repository.SubjectRepository;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {
    
    @Autowired
    private SubjectRepository subjectRepository;
    
    @GetMapping
    public List<SubjectEntity> getAllSubjects() {
        return subjectRepository.findAll();
    }
}

