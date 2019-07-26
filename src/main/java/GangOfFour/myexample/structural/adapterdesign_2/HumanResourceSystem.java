package GangOfFour.myexample.structural.adapterdesign_2;

/*
 * Client System which has employee information as String Array
 *
 */

public class HumanResourceSystem {

	public static String[][] getEmployees() {
		String[][] employees = new String[4][];

		employees[0] = new String[] { "100", "Dave", "Team Leader" };
		employees[1] = new String[] { "101", "Ram", "Developer" };
		employees[2] = new String[] { "102", "Raj", "Developer" };
		employees[3] = new String[] { "103", "Rahul", "Tester" };

		return employees;
	}

	public static void main(String args[]) {

		ITarget target = new EmployeeAdapter();
		System.out
				.println("HR system passes employee string array to Adapter\n");
		target.processCompanySalary(getEmployees());

	}
}

/*
HR system passes employee string array to Adapter

Adapter converted Array of Employee to ArrayList of Employee :
[Employee [empId=100, name=Dave, designation=Team Leader], Employee [empId=101, name=Ram, designation=Developer], Employee [empId=102, name=Raj, designation=Developer], Employee [empId=103, name=Rahul, designation=Tester]]
then call the processSalary method inherited from the ThirdPartyBillingSystem for processing the employee salary

Employee [empId=100, name=Dave, designation=Team Leader] : 70000Rs Salary credited to Dave Account


Employee [empId=101, name=Ram, designation=Developer] : 40000Rs Salary credited to Ram Account


Employee [empId=102, name=Raj, designation=Developer] : 40000Rs Salary credited to Raj Account


Employee [empId=103, name=Rahul, designation=Tester] : 30000Rs Salary credited to Rahul Account

 */
