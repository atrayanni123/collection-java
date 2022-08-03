package student.dto;

import java.util.List;

public class TeacherDto {
    Integer teacherId;
    String teacherFirstName;
    String teacherLastName;
    String subject;
    List<StudentDto> studentList;

    public TeacherDto(int teacherId, String fName, String lName, String subject, List<StudentDto> studentList) {
        this.teacherId = teacherId;
        this.teacherFirstName = fName;
        this.teacherLastName = lName;
        this.subject = subject;
        this.studentList = studentList;
    }

    public void printTeacherInfo() {
        String fullName = teacherFirstName + " " + teacherLastName;
        System.out.println("Teacher: Id= " + teacherId + ", Name= " + fullName + ", Subject = " + subject);

        System.out.println("---Students names:---- ");
        for (int i = 0; i < studentList.size(); i++) {
            StudentDto studentDto = studentList.get(i);
            studentDto.printStudentInfo();
        }

    }
}


