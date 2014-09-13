package myexample.behavioral.strategypattern_one;

public class AutoTravelStrategy implements TravelStrategy {

	public void gotoAirport() {
		System.out
				.println("Traveler is going to Airport by Auto and will be charged 600 Rs");
	}

}