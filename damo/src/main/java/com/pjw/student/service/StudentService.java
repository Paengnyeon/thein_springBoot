package com.pjw.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pjw.student.dto.Student;
import com.pjw.student.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
        return repository.findAll();
    }
}
