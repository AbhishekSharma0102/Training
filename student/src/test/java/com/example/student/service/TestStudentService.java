package com.example.student.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.student.model.Student;


public class TestStudentService {
	@Autowired
    private StudentService studentService;
 
    @Test
    void saveAndGetStudent() {
        Student student = new Student();
        student.setName("Abhishek");
        student.setAge(20);
        student.setSalary(500.00);
 
        studentService.saveStudent(student);
 
        Student retrievedStudent = studentService.getStudentById(student.getId());
        assertNotNull(retrievedStudent);
        assertEquals("Abhishek", retrievedStudent.getName());
        assertEquals(20, retrievedStudent.getAge());
        assertEquals(500.00, retrievedStudent.getSalary(), 0.001);
    }
 
    @Test
    void getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        assertNotNull(students);
        assertTrue(students.size() > 0);
    }
 
    @Test
    void deleteStudent() {
        Student student = new Student();
        student.setName("Sharma");
        student.setAge(25);
        student.setSalary(600.00);
        studentService.saveStudent(student);
 
        Long studentId = student.getId();
        studentService.deleteStudent(studentId);
 
        assertNull(studentService.getStudentById(studentId));
    }
}
