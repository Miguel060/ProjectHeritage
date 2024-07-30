package application;

import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the employee #" + i + " Data :");
            System.out.print("Outsourced? (y/n)");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();
            sc.nextLine();
            if (ch == 'y') {
                System.out.print("Enter additional charge: ");
                double addtionalCharge = sc.nextDouble();
                employees.add(new OutSourcedEmployee(name, hours, value, addtionalCharge));
            }else{
                employees.add(new Employee(name, hours, value));
            }
        }
        System.out.println("PAYMENTS:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        sc.close();
    }
}
