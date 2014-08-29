package myexample.chainresponsibility_one;

public interface DispenseChain {
	 
    void setNextChain(DispenseChain nextChain);
     
    void dispense(Currency cur);
}

