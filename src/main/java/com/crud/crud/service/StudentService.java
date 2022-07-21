package com.crud.crud.service;


import com.crud.crud.entity.Student;
import com.crud.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();

    }


    public Student findStudentByName(String name) {
        return studentRepository.findStudentByStudentName(name);
    }

    public String deleteStudentById(UUID id) {
        boolean isPresent = studentRepository.existsById(id);
        if(isPresent){
            studentRepository.deleteById(id);
            return "{msg: User Deleted}";
        }

        return "{msg: Invalid user}";
    }

    public Student findStudentById(UUID id) {
        Optional<Student> std =  studentRepository.findById(id);
        if(std.isEmpty()){
            return null;
        }

        return std.get();
    }

    public Student updateStudent(UUID id, Student newStudentData) {
        if(studentRepository.existsById(id)){
            Student oldStudentData = studentRepository.findById(id).get();

            oldStudentData.setStudentEmail(newStudentData.getStudentEmail());
            oldStudentData.setStudentNumber(newStudentData.getStudentNumber());
            oldStudentData.setStudentName(newStudentData.getStudentName());

            studentRepository.save(oldStudentData);
            return oldStudentData;
        }

        return null;
    }
}
