package com.company;

import java.util.ArrayList;

public class Employee {
    private String name;
    private double salary;
    private double bonusOrDiscount;
    private double netSalary;

    public static ArrayList<Employee> employees = new ArrayList<Employee>();

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        if (salary <= 1000) {
            bonusOrDiscount = salary * 0.2;
        } else if (salary > 2000) {
            bonusOrDiscount = salary * -0.1;
        } else {
            bonusOrDiscount = salary * 0.1;
        }
        netSalary = salary + bonusOrDiscount;
    }

    public static void print() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("\nFuncionário " + employees.get(i).name);
            System.out.printf("Salario: %.2f \n", employees.get(i).salary);
            if (employees.get(i).bonusOrDiscount > 0) {
                System.out.printf("Bonus: %.2f \n", employees.get(i).bonusOrDiscount);
            } else {
                System.out.printf("Desconto: %.2f \n", Math.abs(employees.get(i).bonusOrDiscount));
            }
            System.out.printf("Salário Liquido: %.2f \n", employees.get(i).netSalary);
        }
    }

}
