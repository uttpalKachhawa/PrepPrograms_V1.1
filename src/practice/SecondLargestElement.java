package practice;

import java.util.Arrays;

/**
 * @author 703238043 on Apr, 2020
 */
public class SecondLargestElement {
    static int largest=Integer.MIN_VALUE;
    static  int second_largest=Integer.MIN_VALUE;

    public static void findSecondLargestElement(int a[]){


        for(int i=0;i<a.length;i++){

            if(a[i]>largest){

                second_largest=largest;
                largest=a[i];

            }

            else if(a[i]>second_largest && a[i]!=largest){

                second_largest=a[i];
            }
        }
        System.out.println(second_largest);

    }

    public static void main(String[] args) {
        int a[]={6,8,2,4,3,1,5,7};
        findSecondLargestElement(a);
    }










}
