package student;



    import java.util.*;


    public class CollectTeacherDetails {

        public static void main(String[] args) {

            List<TeacherInfo> teacherList = new ArrayList<>();
            TeacherInfo teacher1 = new TeacherInfo(1, "kisan", "kumar");
            TeacherInfo teacher2 = new TeacherInfo(2, "mohan", "lal");
            teacherList.add(teacher1);
            teacherList.add(teacher2);

            teacherList.get(0).printTeacherInfo();


            {
                Map<String, List<TeacherInfo>> studentName = new HashMap<>();
                List<TeacherInfo> studentList = new ArrayList<>();
                HashMap<String, Integer> map = new HashMap<String, Integer>();
                List<TeacherInfo> StudentName = new ArrayList<>();
                TeacherInfo student1 = new TeacherInfo(3, "shyam,,ram,mohan,karan", "kumar,kumar,gupta,kumar");
                TeacherInfo student2;
                student2 = new TeacherInfo(5, "savin,kamal,ashish", "kumar,sharma,kumar");

                studentList.add(student1);
                studentList.add(student2);

                for (Map.Entry<String, List<StudentInfo>> entry : teacherList.get(0).entrySet(studentList)) {
                    String teacher = entry.getKey();
                    List<StudentInfo> list = entry.getValue();
                    System.out.println("student: " + student1);
                    // map.put("teacher1", 20)
                    // map.put("teacher2", 45);
                    // System.out.println("Iterating Hashmap...");
                    // for (Map.Entry m : map.entrySet()) {
                    //   System.out.println(m.getKey() + " " + m.getValue());
                    for (StudentInfo studentInfo : list) studentInfo.printStudentInfo();
                }
            }
//            teacherList.get(1).printTeacherInfo();
//
//
//            {
//                Map<String, List<TeacherInfo>> studentName = new HashMap<>();
//                List<TeacherInfo> studentList = new ArrayList<>();
//                HashMap<String, Integer> map = new HashMap<String, Integer>();
//                List<TeacherInfo> StudentName = new ArrayList<>();
//                TeacherInfo student1 = new TeacherInfo(3, "shyam,,ram,mohan,karan", "kumar,kumar,gupta,kumar");
//                TeacherInfo student2;
//                student2 = new TeacherInfo(5, "savin,kamal,ashish", "kumar,sharma,kumar");
//
//                studentList.add(student1);
//                studentList.add(student2);
//
//                for (Map.Entry<String, List<StudentInfo>> entry : teacherList.get(1).entrySet(teacherList)) {
//                    String teacher = entry.getKey();
//                    List<StudentInfo> list = entry.getValue();
//                    System.out.println("student: " + student2);
//                    for (StudentInfo studentInfo : list) {
//                        studentInfo.printStudentInfo();
                        // map.put("teacher1", 20)
                        // map.put("teacher2", 45);
                        // System.out.println("Iterating Hashmap...");
                        // for (Map.Entry m : map.entrySet()) {
                        //   System.out.println(m.getKey() + " " + m.getValue());
                    }
                }


