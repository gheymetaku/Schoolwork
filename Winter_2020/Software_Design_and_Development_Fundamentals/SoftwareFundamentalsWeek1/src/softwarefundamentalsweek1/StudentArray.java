package softwarefundamentalsweek1;

/**
 *
 * @author Omer Siddiqui
 */
public class StudentArray {
        public static void main(String[] args) {
        Student[] studentList = new Student[5];
        System.out.println("Hello world");
        Student student1 = new Student("1", "Jim Halpern");
        studentList[0] = student1;
        studentList[1] = new Student("2", "Michael Scott");
        studentList[2] = new Student("3", "Pam Beasley");
        studentList[3] = new Student("4", "Dwight Schrute");
        studentList[4] = new Student("5", "Toby Flendersen");

        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getName());
        }
    }
}
