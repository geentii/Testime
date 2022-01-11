package week5_Coding;

public class Employee {

    public String name;
    public char gender;
    public int employeeId;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, char gender, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}
