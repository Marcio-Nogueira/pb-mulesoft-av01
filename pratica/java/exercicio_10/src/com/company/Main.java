package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int qty = 0;
        do {
            try {
                System.out.println("Digite a quantidade de funcionários a serem cadastrados: ");
                qty = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Digite um número válido");
            }
            } while (qty == 0);

        do {
            System.out.println("Digite o nome do " + (counter+1) + "º" + " funcionário:");
            String name = scanner.nextLine();
            System.out.println("Digite o salário de " + name + ":");
            double salary = Double.parseDouble(scanner.nextLine());
            Employee employee = new Employee(name, salary);
            Employee.employees.add(employee);

            counter++;
        } while (counter < qty);

        Employee.print();
    }
}
