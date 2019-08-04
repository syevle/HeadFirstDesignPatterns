package GangOfFour.myexample.behavioral.interpreterpattern_2;

public class InterpreterContext {
	 
    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }
     
    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }
}