package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;

public class StudentServiceImpl implements StudentService{
	@Autowired
    private StudentRepository studentRepository;
 
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
 
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
 
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
 
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

	
	
}
