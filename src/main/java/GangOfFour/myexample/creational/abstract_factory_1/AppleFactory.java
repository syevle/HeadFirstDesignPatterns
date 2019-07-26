package GangOfFour.myexample.creational.abstract_factory_1;


public class AppleFactory implements MobileFactory {
	@Override
	public SmartPhone createSmartPhone(SmartPhoneType type) {
		SmartPhone phone = null;
		switch(type){
			case Iphone6: 
				phone = new Iphone6();
				break;
			case Iphone6Plus:
				phone = new Iphone6Plus();
				break;
			default:
				break;
		}
		return phone;
	}

	@Override
	public Tablet createTablet(TabletType type) {
		Tablet tablet = null;
		switch(type){
			case IPadMini4:
				tablet = new IPadMini4();
				break;
			case IPadPro:
				tablet = new IPadPro();
				break;
			default:
				break;
		}
		return tablet;
	}

}
