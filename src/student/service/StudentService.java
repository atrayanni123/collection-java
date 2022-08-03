package student.service;

import student.dto.StudentDto;

import java.util.*;

/**
 * This class is used to add, remove, update students.
 */
public class StudentService {

    public List<StudentDto> getStudentList() {
        List<StudentDto> studentList = new ArrayList<>();
        StudentDto ram = new StudentDto(1, "ram", "kumar", 16, "mumbai");
        StudentDto shyam = new StudentDto(2, "shyam", "kumar", 21, "delhi");
        StudentDto shiv = new StudentDto(3, "shiv", "kumar", 24, "noida");
        StudentDto ganesh = new StudentDto(4, "ganesh", "kumar", 30, "jaipur");

        studentList.add(ram);
        studentList.add(shyam);
        studentList.add(shiv);
        studentList.add(ganesh);
        return studentList;
    }

    private Map<String, List<StudentDto>> mapOfStudent() {
        Map<String, List<StudentDto>> studentByDept = new HashMap<>();

        //      computer science students
        List<StudentDto> computerScienceStudentList = new ArrayList<>();
        StudentDto student1 = new StudentDto(1, "ravi", "kumar", 22, "agra");
        StudentDto student2 = new StudentDto(2, "anand", "kumar", 22, "mumbai");
        computerScienceStudentList.add(student1);
        computerScienceStudentList.add(student2);
        studentByDept.put("Computer Science", computerScienceStudentList);

        //    mechanical students
        List<StudentDto> mechanicalStudentList = new ArrayList<>();
        StudentDto student3 = new StudentDto(3, "rakesh", "kumar", 24, "kolkata");
        StudentDto student4 = new StudentDto(4, "shivam", "kumar", 32, "shimla");
        mechanicalStudentList.add(student3);
        mechanicalStudentList.add(student4);
        studentByDept.put("Mechanical", mechanicalStudentList);
        return studentByDept;
    }

    private Set<StudentDto> setOfStudent() {
        Set<StudentDto> studentDtoSet = new HashSet<>();
        StudentDto student3 = new StudentDto(3, "rakesh", "kumar", 24, "kolkata");
        StudentDto student4 = new StudentDto(4, "shivam", "kumar", 32, "shimla");
        studentDtoSet.add(student3);
        studentDtoSet.add(student4);

        return studentDtoSet;
    }


}

