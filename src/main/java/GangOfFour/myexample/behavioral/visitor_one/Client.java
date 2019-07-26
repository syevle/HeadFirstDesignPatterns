package GangOfFour.myexample.behavioral.visitor_one;

public class Client {

	public static void main(String[] args) {
		School.doHealthCheckup();
	}

}

/*
ChildSpecialistDoctor: 'Dr.Smith' did the checkup of the child: 'John' and found health is not good so updated the health status as 'Bad'

ChildSpecialistDoctor: 'Dr.Smith' did the checkup of the child: 'Steve' and found health is not good so updated the health status as 'Bad'

ChildSpecialistDoctor: 'Dr.Smith' did the checkup of the child: 'Rohit' and found health is not good so updated the health status as 'Bad'

ChildSpecialistDoctor: 'Dr.Smith' did the checkup of the child: 'Sonu' and found health is not good so updated the health status as 'Bad'

 */