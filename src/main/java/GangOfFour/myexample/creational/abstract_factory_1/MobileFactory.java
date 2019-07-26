package GangOfFour.myexample.creational.abstract_factory_1;


public interface MobileFactory {
	public SmartPhone createSmartPhone(SmartPhoneType type);
	public Tablet createTablet(TabletType type);
}
