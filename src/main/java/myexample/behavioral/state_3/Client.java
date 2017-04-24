package myexample.behavioral.state_3;

public class Client {

	public static void main(String[] args) {
		/*
		 * Initially Project in 'RequirementGatheringState'
		 */
		Project project = new Project();

		System.out.println("Project internal state is  : "
				+ project.getProjectState().getClass().getName() + "\n");

		project.doDesignAndArchitecture();
		project.doDevelopement();
		project.doTesting();
		project.doRequirmentGathering();

		System.out.println();

		project.doDesignAndArchitecture();
		project.doTesting();
		project.doDevelopement();
		project.doRequirmentGathering();

	}

}

/*
Project internal state is  : myexample.behavioral.state_3.RequirementGatheringState

Cannot do 'DesignAndArchitecture' because Project is in 'RequirmentGathering' Phase...
Cannot do 'developement' because Project is in 'RequirmentGathering' Phase...
Cannot do 'Testing' because Project is in 'RequirmentGathering' Phase...
'RequirmentGathering' has been started .............
'RequirmentGathering' has been finished by 7 days .............

Project internal state moved to : myexample.behavioral.state_3.DesignAndArchitectureState


'DesignAndArchitecture' has been started .............
'DesignAndArchitecture' has been finished by 10 days .............

Project internal state moved to : myexample.behavioral.state_3.DevelopementState

Cannot do 'Testing' because Project is in 'Developement' Phase...
'Developement' has been started .............
'Developement' has been finished by 40 days .............

Project internal state moved to : myexample.behavioral.state_3.TestingState

Cannot do 'RequirmentGathering' because Project is in 'Testing' Phase...

 */
