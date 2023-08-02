package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + employee.Name + ", $ " +  String.format("%.2f", employee.employeeNetSalary()));
		
		System.out.print("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble();
		//employee.employeeIncreaseSalary(percentage);
		
		System.out.println("Update data: " + employee.Name + ", $ " +  String.format("%.2f", employee.employeeIncreaseSalary(percentage)));
		sc.close();
	}

}
