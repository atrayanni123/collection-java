package student;

import java.util.List;
import java.util.Map;

public class TeacherInfo
{

    Integer id;
    String firstName;
    String lastName;

    list<StudentInfo>studentList;

    public TeacherInfo(int id, String fName, String lName) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
    }

    public void StudentInfo(int id, String fName, String lName) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
    }
    public void printTeacherInfo() {
        String fullName = firstName + " " + lastName;
        System.out.println("Teacher: Name- " + fullName + ", id - " + id);
    }

    public void printTeacher1Info() {
        String fullName = firstName + " " + lastName;
        System.out.println("Teacher: Name- " + fullName + ", id - " + id);
    }

    public Iterable<? extends Map.Entry<String, List<StudentInfo>>> entrySet(List<TeacherInfo> studentList) {
        return null;
    }
}


