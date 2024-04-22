package com.StudentProject.res;

import com.StudentProject.Service.IStudent;
import com.StudentProject.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class StudentRestController {
    @Autowired
    private IStudent service;
@PostMapping("/student")
public Student registerStudent(Student student){
    Student st = service.saveStudent(student);
    return student;
}
//
//@GetMapping("/hello")
//public  void sayHello(){
//    System.out.println("Hello, Your Server is Ok !");
//}

@GetMapping("/students")
    public List<Student> getAllStudent (){
    return service.getAllStudents();
}

@GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
    Student student = service.getStudentById(id);
    return new ResponseEntity<Student>(student,HttpStatus.OK);
}

    @PutMapping("/student/{id}")
    public ResponseEntity<Student> updateStudentById(@PathVariable Long id){
        Student student = service.updateStudentById(id);
        return new ResponseEntity<Student>(student,HttpStatus.OK);
    }

@DeleteMapping("/student/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Long id){
        service.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }
}
