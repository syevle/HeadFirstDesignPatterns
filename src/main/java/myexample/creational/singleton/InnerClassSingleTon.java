package myexample.creational.singleton;

public class InnerClassSingleTon {
	 
    private InnerClassSingleTon(){}
     
    private static class SingletonHelper{
        private static final InnerClassSingleTon INSTANCE = new InnerClassSingleTon();
    }
     
    public static InnerClassSingleTon getInstance(){
        return SingletonHelper.INSTANCE;
    }
}