package com.alexgladun.Dao;

import com.alexgladun.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 28.01.2017.
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

        private static Map<Integer, Student> students;

        static {
            students = new HashMap<Integer, Student>(){
                {
                    put(1, new Student(1, "Said", "Computer Science"));
                    put(2, new Student(2, "Alex", "Finance"));
                    put(3, new Student(3, "Anna", "Math"));
                }
            };

        }

        public Collection<Student> getAllStudents(){
            return students.values();
        }

        public Student getStudentById(int id){
            return students.get(id);
        }

        public void removeStudent(int id){
            students.remove(id);
        }

        public void addStudent(Student student){
            students.put(student.getId(), student);
        }

        public void updateStudent(Student student){
            students.put(student.getId(), student);
        }
    }

