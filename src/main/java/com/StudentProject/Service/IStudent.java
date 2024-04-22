package com.StudentProject.Service;

import com.StudentProject.Student;

import java.util.List;

public interface IStudent {
    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    void deleteStudentById(Long id);
}
