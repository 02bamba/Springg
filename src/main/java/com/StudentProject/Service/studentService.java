package com.StudentProject.Service;

import com.StudentProject.Student;

import java.util.List;

public class studentService implements IStudent{

    @Override
    public Student saveStudent(Student student) {
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }
}
