package interviewCode.corejava.javatricky;


class Test5{
//    void sum(int a,int b){System.out.println("int arg method invoked");}
    void sum(long a,long b){System.out.println("long arg method invoked");}

    public static void main(String args[]){
        Test5 obj=new Test5();
        obj.sum(20,20);//now int arg sum() method gets invoked
    }
}