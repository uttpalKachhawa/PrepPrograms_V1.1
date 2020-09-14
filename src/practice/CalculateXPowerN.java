package practice;

/**
 * @author uttpal on Apr, 2020
 */
public class CalculateXPowerN {

        /* Function to calculate x raised to the power y */
        public static int power(int base, int powerRaised) {
            if (powerRaised != 0)
                return (base * power(base, powerRaised - 1));
            else
                return 1;
        }
        /* Program to test function power */
        public static void main(String[] args)
        {
            int x = 2;
            int y = 3;

            System.out.printf("%d", power(x, y));
        }
    }



