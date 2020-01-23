package softwarefundamentalsweek1;

/**
 *
 * @author Omer Siddiqui
 */
public class EmployeeTest {
    public static void main(String args[]){
        Employee [] empList = new Employee[2];
        Employee temp = new Employee("Vox","b786",70000);
        empList[0]=temp;
        empList[1]=new Employee("Yun","d0420",125700);
        
        for(Employee e: empList){
            System.out.println(e.getName());
        }
    }
}
