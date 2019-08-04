package GangOfFour.myexample.behavioral.mediatorpattern_1;

public interface IATCMediator {

	public void registerRunway(Runway runway);

	public void registerFlight(Flight flight);

	public boolean isLandingOk();

	public void setLandingStatus(boolean status);
}
