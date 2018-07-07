package task1;

import java.util.Arrays;
import java.util.List;

public class Payday {

	public static void main(String[] args) {
		List<Payable> emps = Arrays.asList(
				new HourlyEmployee(111, "Halil", 2000, 50),
				new HourlyEmployee(111, "Halil", 2000, 50), 
				new SalariedEmployee(111, "S", 1000000));
		
		
		payThemAll(emps);

	}

	static void payThemAll(List<Payable> emList) {
		for (Payable emp : emList) {
			emp.getPaid();
		}

	}

}
