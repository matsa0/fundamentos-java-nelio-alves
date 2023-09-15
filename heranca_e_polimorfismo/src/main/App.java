package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import employees.Employee;
import employees.OutsourcedEmployee;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<>();
        Employee employee;
        System.out.println("How many employees do you want to register? : ");
        int n = sc.nextInt();

        sc.nextLine();

        for(int i=1; i<=n; i++) {
            System.out.println("Employee #" + i + " data:");

            System.out.println("Outsourced (y/n)? : ");
            char outsourced = sc.nextLine().charAt(0);
            
            if(outsourced == 'y') {
                System.out.println("Name: ");
                String name = sc.nextLine();

                System.out.println("Hours: ");
                int hours = sc.nextInt();

                System.out.println("Value per hour: ");
                double valuePerHour = sc.nextDouble();

                System.out.println("Additional Charge: ");
                double addCharge = sc.nextDouble();

                employee = new OutsourcedEmployee(name, hours, valuePerHour, addCharge);
                emp.add(employee);
            }
            else if (outsourced == 'n') {
                System.out.println("Name: ");
                String name = sc.nextLine();
    
                System.out.println("Hours: ");
                int hours = sc.nextInt();
    
                System.out.println("Value per hour: ");
                double valuePerHour = sc.nextDouble();
    
                sc.nextLine();
    
                employee = new Employee(name, hours, valuePerHour);
                emp.add(employee);
            }
        }

        System.out.println("***PAYMENTS***");
        for(Employee e : emp) {
            System.out.println(e);
        }

        sc.close();
    }

}
