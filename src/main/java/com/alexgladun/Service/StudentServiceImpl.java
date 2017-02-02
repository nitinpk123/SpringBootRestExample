package com.alexgladun.Service;

import com.alexgladun.Dao.StudentDAO;
import com.alexgladun.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Alex on 28.01.2017.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public Collection<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }

    public Student getStudentById(int id){
        return studentDAO.getStudentById(id);
    }

    public void removeStudent(int id){
       studentDAO.removeStudent(id);
    }

    public void addStudent(Student student){
        studentDAO.addStudent(student);
    }

    public void updateStudent(Student student){
        studentDAO.updateStudent(student);
    }
}
