package myexample.mediatorpattern_one;

public class MediatorDesignPattern {
	public static void main(String args[]) {

		IATCMediator atcMediator = new ATCMediator();
		Flight sparrow101 = new Flight(atcMediator);
		Runway mainRunway = new Runway(atcMediator);
		atcMediator.registerFlight(sparrow101);
		atcMediator.registerRunway(mainRunway);
		sparrow101.getReady();
		mainRunway.land();
		sparrow101.land();
	}
}