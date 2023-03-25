package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {
    HashMap<String,Student> studentDb = new HashMap<>();
    HashMap<String,Teacher> teacherDb = new HashMap<>();
    HashMap<String,ArrayList<String>> teacher_student = new HashMap<>();

    public void addStudent(Student student){
        studentDb.put(student.getName(),student);
    }
    public void addTeacher(Teacher teacher){
        teacherDb.put(teacher.getName(),teacher);
    }
    public Student getStudentByName(String name){
        return studentDb.get(name);
    }
    public Teacher getTeacherByName(String name){
        return teacherDb.get(name);
    }
    public List<String> getAllStudents(){
        return new ArrayList<>(studentDb.keySet());
    }
    public void deleteTeacherByName(String name){
        teacherDb.remove(name);
        if(teacher_student.containsKey(name)) teacher_student.remove(name);
    }
    public void deleteAllTeachers(){
        teacherDb.clear();
        teacher_student.clear();
    }
    public void addStudentTeacherPair(String student,String teacher){
        if(teacher_student.containsKey(teacher)){
            teacher_student.get(teacher).add(student);
        }
        else{
            ArrayList<String> teacher_student_pair = new ArrayList<>();
            teacher_student_pair.add(student);
            teacher_student.put(teacher,teacher_student_pair);
        }
    }
    public List<String> getStudentsByTeacherName(String teacher){
        if(!teacher_student.containsKey(teacher)) return new ArrayList<>();
        return teacher_student.get(teacher);
    }
}
