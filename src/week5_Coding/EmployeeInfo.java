package week5_Coding;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeInfo {
    public static void main(String[] args) {

        Employee employee1 = new Employee();

//        employee.toString();
        employee1.setInfo("Gent",'M',181944319,"Student",110000);
//        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.setInfo("Besnik",'M',2131421,"Student",12.0000);
//        System.out.println(employee2);

        Employee employee3 = new Employee();
        employee3.setInfo("Pleurat",'M',1321441,"Student",13.00000);
//        System.out.println(employee3);

        Employee employee4 = new Employee();
        employee4.setInfo("Ylli",'M',1321431,"Student",1400.000);
//        System.out.println(employee4);

        Employee employee5 = new Employee();
        employee5.setInfo("Blerta",'F',1234421,"Student",200);
//        System.out.println(employee5);

        System.out.println("---------------------------------------------------------------------------------------");

        Employee[] arr = {employee1,employee2,employee3,employee4,employee5};
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(arr) );
        double budget = 0;
//        System.out.println(employees);

        for ( Employee each : employees ) {
            System.out.println(each);
            budget += each.salary;
        }
        System.out.println("budget = " + budget);

        System.out.println("---------------------------------------------------------------------------------------");

        ArrayList<Employee> list1 = new ArrayList<>(employees);

        list1.removeIf( employee -> employee.salary <= 1300 );
        for ( Employee each : list1 ) {
            System.out.println(each);
        }
    }
}
