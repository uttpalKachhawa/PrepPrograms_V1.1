package PayPayProblem;


import java.io.IOException;
import java.util.Scanner;

/**
 * @author uttpal on Sep, 2020
 */
public class BinarySumProblem {

    public static String addBinary(String input0, String input1) {

        // Use as radix 2 because it's binary
        int number0 = Integer.parseInt(input0, 2);
        int number1 = Integer.parseInt(input1, 2);

        int sum = number0 + number1;
        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) throws IOException {
        Scanner inputs = new Scanner(System.in);

        while (inputs.hasNextLine()) {
            print(inputs.nextLine());
        }
    }
        private static void print(String line){
            String pp = line.split(",")[0];
            String ch =line.split(",")[1];

            System.out.println(addBinary(pp, ch));
        }

    }
