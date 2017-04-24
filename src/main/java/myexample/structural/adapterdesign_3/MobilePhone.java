package myexample.structural.adapterdesign_3;

public class MobilePhone {

	public static void main(String args[]) {
		new MobilePhone().chargeMe();
	}

	public void chargeMe() {
		ITarget target = new MobilePhoneCharger();
		Volt volt = target.get9Volt();
		System.out.println("Mobile phone is charging using : "
				+ volt.getVolts() + "v");
	}
}

/*
From ElectricSocket MobilePhoneCharger got :120v

MobilePhoneCharger converterd 120v to 9v

Mobile phone is charging using : 9v
*/
