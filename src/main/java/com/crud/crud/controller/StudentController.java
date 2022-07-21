package com.crud.crud.controller;

import com.crud.crud.entity.Student;
import com.crud.crud.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    // adding student into the database
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }


    // getting list of students
    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    // finding student by name
    @GetMapping("/student/name/{name}")
    public Student findStudentByName(@PathVariable String name){
        return studentService.findStudentByName(name);
    }

    // finding student by ID
    @GetMapping("/student/id/{id}")
    public Student findStudentById(@PathVariable UUID id){
        return studentService.findStudentById(id);
    }

    // deleting student by ID
    @DeleteMapping("/student/id/{id}")
    public String deleteStudentById(@PathVariable UUID id){
        return studentService.deleteStudentById(id);
    }


    // update email
    @PutMapping("/student/id/{id}")
    public Student updateStudent(@PathVariable UUID id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }





    @GetMapping("/")
    public String home(){
        return "Hello World...!";
    }
}
