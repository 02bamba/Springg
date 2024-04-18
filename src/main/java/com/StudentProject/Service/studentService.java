package com.StudentProject.Service;

import com.StudentProject.Student;
import com.StudentProject.dao.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class studentService implements IStudent{
@Autowired
    private StudentRepo repo;
    @Override
    public Student saveStudent(Student student) {
        repo.save(student);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> st = repo.findAll();
        return st;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }
}
