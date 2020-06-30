package practice;

public class FindCountBlowCakePrblm {

    public static void main(String[] args) {

        int a[] = {8, 7, 7, 5, 3, 8, 8, 3, 5, 3, 7};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (a[i] > a[j]) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        int b = 0;
        a[b] = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[b] != a[i]) {
                b++;
                a[b] = a[i];

            }
        }

        System.out.print("Minimum blows required are: ");
        System.out.println(b+1);
    }

}
