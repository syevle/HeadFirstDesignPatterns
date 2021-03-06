package GangOfFour.myexample.behavioral.chainresponsibility_2;

public class ChainPatternDemo {

	public static void main(String[] args) {
		TeamLeader teamLeader = new TeamLeader();
		ProjectLeader projectLeader = new ProjectLeader();
		HR hr = new HR();
		teamLeader.setNextSupervisor(projectLeader);
		projectLeader.setNextSupervisor(hr);
		teamLeader.applyLeave("David", 9);
		System.out.println();
		teamLeader.applyLeave("John", 18);
		System.out.println();
		teamLeader.applyLeave("Steve", 30);
		System.out.println();
		teamLeader.applyLeave("Rohan", 50);

	}

}

/*
====================================Output=======================================
TeamLeader approved 9 days Leave for the employee : David

ProjectLeader approved 18 days Leave for the employee : John

HR approved 30 days Leave for the employee : Steve

Leave application suspended, Please contact HR

Process finished with exit code 0
 */
