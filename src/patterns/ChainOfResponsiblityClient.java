package patterns;

import java.util.Scanner;

/**
 * @author uttpal on Jul, 2020
 */
public class ChainOfResponsiblityClient {


    private DispenseChain dispenseChain;

    public ChainOfResponsiblityClient() {

        //initialize teh chain
        this.dispenseChain = new Dollar50Dispenser();
        DispenseChain c1 = new Dollar20Dispenser();
        DispenseChain c2 = new Dollar10Dispenser();

        //set the chain of responsiblity
        dispenseChain.setNextChain(c1);
        c1.setNextChain(c2);
    }

    public static void main(String[] args) {

        ChainOfResponsiblityClient chainOfResponsiblityClient = new ChainOfResponsiblityClient();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to Dispense");
            Scanner sc = new Scanner(System.in);
            amount = sc.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10");
                return;
            }
        //process teh request
            chainOfResponsiblityClient.dispenseChain.dispense(new Currency(amount));
        }
    }

}
