package com.driver;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepository studentRepository = new StudentRepository();
    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }
    public void addTeacher(Teacher teacher){
        studentRepository.addTeacher(teacher);
    }
    public Student getStudentByName(String name){
        return studentRepository.getStudentByName(name);
    }
    public Teacher getTeacherByName(String name){
        return studentRepository.getTeacherByName(name);
    }
    public List<String> getAllStudents(){
        return studentRepository.getAllStudents();
    }
    public void deleteTeacherByName(String name){
        studentRepository.deleteTeacherByName(name);
    }
    public void deleteAllTeachers(){
        studentRepository.deleteAllTeachers();
    }
    public void addStudentTeacherPair(String student,String teacher){
        studentRepository.addStudentTeacherPair(student,teacher);
    }
    public List<String> getStudentsByTeacherName(String teacher){
        return studentRepository.getStudentsByTeacherName(teacher);
    }
}
