package interviewCode.corejava.instaceofjava;

/**
 * Created by Santosh on 6/1/17.
 */
public class primenumbers {

    public static void main(String[] args) {

        int num=50;
        int count=0;

        for(int i=2;i<=num;i++){

            count=0;

            for(int j=2;j<=i/2;j++){

                if(i%j==0){
                    count++;
                    break;
                }

            }

            if(count==0){

                System.out.println(i);

            }

        }

    }

}

/*
============================OutPut=============================
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47

 */
