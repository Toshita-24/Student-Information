package com.example.StuInfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StuInfo.Entity.StudentEntity;
import com.example.StuInfo.Repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    
    @Autowired
    private StudentRepository studentRepository;
    
    @PostMapping
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentRepository.save(student);
    }
    
    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}
