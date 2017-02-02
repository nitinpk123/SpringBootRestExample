package com.alexgladun.Controller;

import com.alexgladun.Entity.Student;
import com.alexgladun.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Alex on 28.01.2017.
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student student(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public void removeStudent(@PathVariable("id") int id){
        studentService.removeStudent(id);
    }

    @PostMapping()
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping()
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }
}
