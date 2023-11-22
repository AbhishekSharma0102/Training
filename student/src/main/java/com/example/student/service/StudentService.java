package com.example.student.service;

import java.util.List;

import com.example.student.model.Student;

public interface StudentService {
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    void deleteStudent(Long id);
}

    
    
    
   

