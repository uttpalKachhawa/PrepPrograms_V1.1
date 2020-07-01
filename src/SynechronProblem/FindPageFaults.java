package SynechronProblem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uttpal on Jun, 2020
 */
public class FindPageFaults {

    public static void main(String[] args) {

        int arr[] = {5, 0, 1, 3, 2, 4, 1, 0, 5};
        int size = 4;
        int pageCount = 0;
        int numPageFault = 0;
        List<Integer> s = new ArrayList<>(size);
        for (Integer page : arr) {
            if (!s.contains(page)) {
                if (s.size() == size) {
                    s.remove(0);
                    s.add(size - 1, page);
                } else

                    s.add(pageCount, page);
                numPageFault++;
                ++pageCount;

            } else {
                s.remove(page);
                s.add(s.size(), page);
            }

        }

        System.out.print("Requested pages:: ");
        for (int element : arr) {
            System.out.print(element);
        }

        System.out.println();
        System.out.println("PageCount: " + size);
        System.out.println("Expected Page Fault: " + numPageFault);
    }
}
