package GangOfFour.myexample.behavioral.chainresponsibility_2;

public class HR extends Employee {
	// HR can only approve upto 30 days of leave
	private int MAX_LEAVES_CAN_APPROVE = 30;

	public void applyLeave(String employeeName, int numberofDaysLeave) {
		if (numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE) {
			approveLeave(employeeName, numberofDaysLeave);
		} else {
			System.out
					.println("Leave application suspended, Please contact HR");
		}
	}

	private void approveLeave(String employeeName, int numberofDaysLeave) {
		System.out.println("HR approved " + numberofDaysLeave + " days "
				+ "Leave for the employee : " + employeeName);

	}
}
