package GangOfFour.myexample.behavioral.strategypattern_1;

import java.util.Scanner;

public class Traveler {

	public static void main(String[] args) {

		System.out
				.println("Please enter Travel Type : 'Bus' or 'Train' or 'Taxi' or 'Auto' ");
		Scanner scanner = new Scanner(System.in);
		String travelType = scanner.next();
		System.out.println("Travel type is : " + travelType);

		TravelContext ctx = null;
		ctx = new TravelContext();

		if ("Bus".equalsIgnoreCase(travelType)) {
			ctx.setTravelStrategy(new BusTravelStrategy());
		} else if ("Train".equalsIgnoreCase(travelType)) {
			ctx.setTravelStrategy(new TrainTravelStrategy());
		} else if ("Taxi".equalsIgnoreCase(travelType)) {
			ctx.setTravelStrategy(new TaxiTravelStrategy());
		} else if ("Auto".equalsIgnoreCase(travelType)) {
			ctx.setTravelStrategy(new AutoTravelStrategy());
		}
		System.out.println("Travel context has : " + ctx.getTravelStrategy());
		ctx.gotoAirport();

	}
}


/*
Please enter Travel Type : 'Bus' or 'Train' or 'Taxi' or 'Auto'
Bus
Travel type is : Bus
Travel context has : GangOfFour.myexample.behavioral.strategypattern_one.BusTravelStrategy@2626b418
Traveler is going to Airport by bus and will be charged 200 Rs


Please enter Travel Type : 'Bus' or 'Train' or 'Taxi' or 'Auto'
Train
Travel type is : Train
Travel context has : GangOfFour.myexample.behavioral.strategypattern_one.TrainTravelStrategy@2626b418
Traveler is going to Airport by Train and will be charged 300 Rs


 */