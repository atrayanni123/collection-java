package student.service;


import student.dto.StudentDto;
import student.dto.TeacherDto;

import java.util.ArrayList;
import java.util.List;


public class TeacherService {
    List<TeacherDto> teacherList = new ArrayList<>();

    public List<TeacherDto> registerNewStudents(List<StudentDto> studentList) {
        TeacherDto englishTeacher = new TeacherDto(1, "kisan", "kumar", "English", studentList);
        TeacherDto scienceTeacher = new TeacherDto(2, "mohan", "lal", "Science", studentList);

        teacherList.add(englishTeacher);
        teacherList.add(scienceTeacher);
        return teacherList;
    }

    //ToDo: add new teacher to the teacherList
    public void addNewTeacher(String fName,String lName,String subjectName ,Integer teacherId, List<StudentDto> studentList){
        TeacherDto newTeacher = new TeacherDto(teacherId,fName,lName,subjectName,studentList );
        teacherList.add(newTeacher);
        System.out.println("new teacher has been added successfully.");
    }

    public List<TeacherDto> getTeacherList() {

        return teacherList;
    }
//Todo: get teacher by name

    //Todo: update teacher detail
}


