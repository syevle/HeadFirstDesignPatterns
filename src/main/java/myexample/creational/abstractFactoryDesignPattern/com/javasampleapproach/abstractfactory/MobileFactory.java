package myexample.creational.abstractFactoryDesignPattern.com.javasampleapproach.abstractfactory;


public interface MobileFactory {
	public SmartPhone createSmartPhone(SmartPhoneType type);
	public Tablet createTablet(TabletType type);
}
