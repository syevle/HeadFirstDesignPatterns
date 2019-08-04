package GangOfFour.myexample.behavioral.chainresponsibility_1;

public interface DispenseChain {
	 
    void setNextChain(DispenseChain nextChain);
     
    void dispense(Currency cur);
}

