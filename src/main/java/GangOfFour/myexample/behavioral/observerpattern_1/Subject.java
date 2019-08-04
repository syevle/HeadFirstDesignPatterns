package GangOfFour.myexample.behavioral.observerpattern_1;

public interface Subject {

	public void registerObserver(Observer observer);

	public void notifyObserver();

	public void unRegisterObserver(Observer observer);

	public Object getUpdate();

}
