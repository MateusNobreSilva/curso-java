package entities;

public class Employee {
	
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double employeeNetSalary() {
		double result = GrossSalary - Tax;
		return result;
	}
	
	public double employeeIncreaseSalary(double percentage) {
		
		double increase = GrossSalary * (percentage / 100);
		GrossSalary += increase;
		GrossSalary -= Tax;
		return GrossSalary;
		
	}

}

