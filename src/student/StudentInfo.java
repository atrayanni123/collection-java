package student;


/**
 * POJO Class - Plain Object Java Class
 * This class is used only to store information about the student.
 */
public class StudentInfo {
    // Attributes (fields)
    Integer rollNo;
    String firstName;
    String lastName;
    list<StudentInfo>studentList;
    /**
     * Constructor - used to create new object of this class type.
     */
    public StudentInfo(int roll, String fName, String lName) {
        this.rollNo = roll;
        this.firstName = fName;
        this.lastName = lName;
    }

    /**
     * This method used to print the student information.
     */
    public void printStudentInfo() {
        String fullName = firstName + " " + lastName;
        System.out.println("Student: Name- " + fullName + ", RollNo - " + rollNo);
    }
}


