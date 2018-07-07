package task1;

public class HourlyEmployee extends Employee {

	int hour;
	double wage;

	// constructor
	public HourlyEmployee(int employeeID, String name) {
		super(employeeID, name);
		
	}

	public HourlyEmployee(int employeeID, String name, int hour, double wage) {
		super(employeeID, name);
		this.hour = hour;
		this.wage = wage;
	}

	// method
	public void submithourDaily() {
		System.out.println("hourly employee submiting daily");
	}

	// toString override
	@Override
	public String toString() {
		return "SalariedEmployee [hour=" + hour + ", wage=" + wage + "]";
	}

	@Override
	public double getPaid() {
		double result = calculateAnnualSalary();
		System.out.println("hourly employee getting paid "+result);
		return result;
		
	}

	@Override
	public double calculateAnnualSalary() {
		return hour*wage*12;
		
	}

}
