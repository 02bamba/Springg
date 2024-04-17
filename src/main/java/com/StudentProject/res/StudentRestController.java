package com.StudentProject.res;

import com.StudentProject.Service.IStudent;
import com.StudentProject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
public class StudentRestController {
    @Autowired
    private IStudent service;
@PostMapping("/student")
public Student registerStudent(Student student){
    Student st = service.saveStudent(student);
    return student;
}

@GetMapping("/students")
    public List<Student> getAllStudent (){
    return service.getAllStudents();
}

@GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id){
    Student student = service.getStudentById(id);
    return new Student();
}

@GetMapping("/student/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Long id){
        Student student = service.getStudentById(id);
        return ResponseEntity.noContent().build();
    }
}
