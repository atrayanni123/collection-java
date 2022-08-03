package student;

import student.dto.StudentDto;
import student.dto.TeacherDto;
import student.service.StudentService;
import student.service.TeacherService;

import java.util.List;

public class AdminController {

    public static void main(String[] args) {
        System.out.println("==================== Welcome to our College =====================");
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();

        /**
         * Feature - 1
         */
        List<StudentDto> studentList = studentService.getStudentList();
        System.out.println("We have " + studentList.size() + " students in our school.");

        List<TeacherDto> registeredTeacherList = teacherService.registerNewStudents(studentList);
        System.out.println("We have " + registeredTeacherList.size() + " registered teachers in our school.");

        System.out.println("---------------- Now we are showing all the details -------------");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < registeredTeacherList.size(); i++) {
            TeacherDto teacher = registeredTeacherList.get(i);
            teacher.printTeacherInfo();
            System.out.println();
        }

        /**
         * Feature - 2
         */
        //ToDo: add new teacher to the teacherList

        /**
         * Feature - 3
         */
        //Todo: get teacher by name

        /**
         * Feature - 4
         */
        //Todo: update teacher detail

        System.out.println("==================== Thanks For Watching =====================");
    }
}
