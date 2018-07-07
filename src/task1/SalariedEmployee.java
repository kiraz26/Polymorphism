package task1;

public class SalariedEmployee extends Employee {
	
	
	double monthlySalary;
	//constructor
	

	public SalariedEmployee(int employeeID, String name, double monthlySalary) {
		super(employeeID, name);
		this.monthlySalary = monthlySalary;
		
	}
	//method
	public void submithourDaily() {
		System.out.println();
	}
	
	//toString override
	@Override
	public String toString() {
		return "SalariedEmployee [monthlySalary=" + monthlySalary + "]";
	}
	@Override
	public double getPaid() {
		// TODO Auto-generated method stub
		double result = calculateAnnualSalary();
		System.out.println("salaried getting paid "+result);
		return result;
	}
	@Override
	public double calculateAnnualSalary() {
		return monthlySalary*12;
		
	}
	
	
	
	
	
	
	

}
