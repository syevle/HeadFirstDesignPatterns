package GangOfFour.myexample.creational.abstract_factory_1;


public class SamsungFactory implements MobileFactory {

	@Override
	public SmartPhone createSmartPhone(SmartPhoneType type) {
		SmartPhone phone = null;
		switch(type){
			case GalaxyJ7: 
				phone = new GalaxyJ7();
				break;
			case GalaxyOn7:
				phone = new GalaxyOn7();
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
			case GalaxyTabA:
				tablet = new GalaxyTabA();
				break;
			case GalaxyTabS2:
				tablet = new GalaxyTabS2();
				break;
			default:
				break;
		}
		return tablet;
	}

}
