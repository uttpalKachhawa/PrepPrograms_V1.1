package practice;

/**
 * @author uttpal on Apr, 2020
 */
public class SecondSmallestElement {


    static int smallest = Integer.MAX_VALUE;
    static int second_smallest = Integer.MAX_VALUE;


    public static void findSecondsmallestElement(int a[]) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] < smallest) {

                second_smallest = smallest;
                smallest = a[i];

            } else if (a[i] < second_smallest && a[i] != smallest) {

                second_smallest = a[i];
            }
        }
        System.out.println(second_smallest);

    }

    public static void main(String[] args) {
        int a[] = {6, 8, 2, 4, 3, 1, 5, 7};
        findSecondsmallestElement(a);
    }
}
