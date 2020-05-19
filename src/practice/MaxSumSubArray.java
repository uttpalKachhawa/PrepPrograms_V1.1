package practice;

/**
 * @author 703238043 on Apr, 2020
 */
public class MaxSumSubArray {

    public static void main(String[] args) {

        int[] a = {4, -2, -3, 4, -1, -2, 1, 5, -3};

        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int strt = 0;
        int strtIndex=0;
        int endIndx=0;
        for (int i = 0; i < a.length; i++) {

            max_ending_here = max_ending_here + a[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                strtIndex=strt;
                endIndx=i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                strt=i+1;
            }
        }
        System.out.println("MaxSub Array Sum is"+ max_so_far);
        System.out.println("Starting index of Sub array Sum is "+strtIndex+ "  End index of sum Sub Array is " + endIndx);
    }
}
