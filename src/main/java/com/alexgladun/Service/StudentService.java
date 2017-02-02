package com.alexgladun.Service;

import com.alexgladun.Entity.Student;

import java.util.Collection;

/**
 * Created by Alex on 28.01.2017.
 */
public interface StudentService {

    public Collection<Student> getAllStudents();

    public Student getStudentById(int id);

    public void removeStudent(int id);

    public void addStudent(Student student);

    public void updateStudent(Student student);
}
