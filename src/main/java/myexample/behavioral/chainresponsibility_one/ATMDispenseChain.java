package myexample.behavioral.chainresponsibility_one;

import java.util.Scanner;

public class ATMDispenseChain {
 
    private final DispenseChain c1;
 
    @SuppressWarnings("WeakerAccess")
    public ATMDispenseChain() {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
 
        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
 
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }
 
    }
 
}

/*
================================Output================================
Enter amount to dispense
550
Dispensing 11 50$ note
Enter amount to dispense
100060
Dispensing 2001 50$ note
Dispensing 1 10$ note
Enter amount to dispense
680
Dispensing 13 50$ note
Dispensing 1 20$ note
Dispensing 1 10$ note
Enter amount to dispense
67
Amount should be in multiple of 10s.

Process finished with exit code 0

 */

