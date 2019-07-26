package GangOfFour.myexample.behavioral.state_2;

public interface VendingMachineState {

	public void selectProductAndInsertMoney(int amount, String productName);

	public void dispenseProduct();

}
