package myexample.creational.abstractFactoryDesignPattern.com.javasampleapproach.abstractfactory;

import com.javasampleapproach.abstractfactory.factories.AppleFactory;
import com.javasampleapproach.abstractfactory.factories.SamsungFactory;

public class MobileProducer {
	public static MobileFactory getMobileFactory(MobileFactoryType type){
		MobileFactory factory = null;
		switch(type){
			case AppleFactory: 
				factory = new AppleFactory();
				break;
			case SamsungFactory:
				factory = new SamsungFactory();
				break;
			default:
				break;
		}
		return factory;
	}
}
