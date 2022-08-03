package student;

import java.util.*;

/**
 * This class is used to add, remove, update students.
 */
public class CollectStudentDetails {

    public static void main(String[] args) {
        listOfStudent();
//        setOfStudent();
        //      mapOfStudent();
    }

    /**
     * example for list
     */
    private static void listOfStudent() {
        List<StudentInfo> studentList = new ArrayList<>();
        StudentInfo student1 = new StudentInfo(1, "ravi", "kumar");
        StudentInfo student2 = new StudentInfo(2, "anand", "kumar");
        studentList.add(student1);
        studentList.add(student2);

        //printing the list
        for (StudentInfo student : studentList) {
            student.printStudentInfo();
        }
    }

    /**
     * example for map
     */
    private static void mapOfStudent() {
        Map<String, List<StudentInfo>> studentByDept = new HashMap<>();

        //      computer science students
        List<StudentInfo> computerScienceStudentList = new ArrayList<>();
        StudentInfo student1 = new StudentInfo(1, "ravi", "kumar");
        StudentInfo student2 = new StudentInfo(2, "anand", "kumar");
        computerScienceStudentList.add(student1);
        computerScienceStudentList.add(student2);
        studentByDept.put("Computer Science", computerScienceStudentList);

        //    mechanical students
        List<StudentInfo> mechanicalStudentList = new ArrayList<>();
        StudentInfo student3 = new StudentInfo(3, "rakesh", "kumar");
        StudentInfo student4 = new StudentInfo(4, "shivam", "kumar");
        mechanicalStudentList.add(student3);
        mechanicalStudentList.add(student4);
        studentByDept.put("Mechanical", mechanicalStudentList);

        // printing the map
        for (Map.Entry<String, List<StudentInfo>> entry : studentByDept.entrySet()) {
            String dept = entry.getKey();
            List<StudentInfo> list = entry.getValue();
            System.out.println("Dept: " + dept);
            for (StudentInfo studentInfo : list) {
                studentInfo.printStudentInfo();
            }
        }

        studentByDept.forEach((dept, list) -> {
            System.out.println("Dept: " + dept);
            list.forEach(StudentInfo::printStudentInfo);
        });

    }

    /**
     * example for set
     */
    private static void setOfStudent() {
        Set<StudentInfo> studentInfoSet = new HashSet<>();
        StudentInfo student3 = new StudentInfo(3, "rakesh", "kumar");
        StudentInfo student4 = new StudentInfo(4, "shivam", "kumar");
        studentInfoSet.add(student3);
        studentInfoSet.add(student4);

        //printing the set
        for (StudentInfo student : studentInfoSet) {
            student.printStudentInfo();
        }

        studentInfoSet.forEach(StudentInfo::printStudentInfo);
    }


}

