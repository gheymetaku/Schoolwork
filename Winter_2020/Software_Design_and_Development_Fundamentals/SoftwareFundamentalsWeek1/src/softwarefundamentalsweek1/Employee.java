package softwarefundamentalsweek1;

/**
 *
 * @author Omer Siddiqui
 */
public class Employee {
    private String name;
    private String blankId;
    private double salary;
    
    public Employee(String n, String e, double s){
        name = n;
        blankId = e;
        salary = s;
    }

    /**
     * @returns the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the blankId
     */
    public String getBlankId() {
        return blankId;
    }

    /**
     * @param blankId the blankId to set
     */
    public void setBlankId(String blankId) {
        this.blankId = blankId;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
