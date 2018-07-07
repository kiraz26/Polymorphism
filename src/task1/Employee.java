package task1;

public abstract class Employee implements Payable {
	private int employeeID;
	private String name;

	// Constructor
	public Employee(int employeeID, String name) {
		this.employeeID = employeeID;
		this.name = name;
	}

	// Getters
	public int getEmployeeID() {
		return employeeID;
	}


	public String getName() {
		return name;
	}

	// toString()
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", name=" + name + "]";
	}

}
