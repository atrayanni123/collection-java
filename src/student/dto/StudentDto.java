package student.dto;


/**
 * POJO/DTO Class - Plain Object Java Class
 * This class is used only to store information about the student.
 */
public class StudentDto {
    // Attributes (fields)
    Integer rollNo;
    String firstName;
    String lastName;
    int age;
    String city;

    /**
     * Constructor - used to create new object of this class type.
     */
    public StudentDto(int roll, String fName, String lName, int age, String city) {
        this.rollNo = roll;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
        this.city = city;
    }

    /**
     * This method used to print the student information.
     */
    public void printStudentInfo() {
        String fullName = firstName + " " + lastName;
        System.out.println("Student: Name- " + fullName + ", RollNo - " + rollNo);
    }
}


