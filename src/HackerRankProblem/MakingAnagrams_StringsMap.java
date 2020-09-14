package HackerRankProblem;

import java.io.IOException;
import java.util.*;

import static HackerRankProblem.MakingAnagrams_Strings.makeAnagram;

/**
 * @author uttpal on Sep, 2020
 */
public class MakingAnagrams_StringsMap {

    static int makeAnagram(String a, String b) {

        Map<Character, Integer> map = new HashMap<>();

        for (Character character : a.toCharArray()) {

            int count = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, (count + 1));
        }

        for (Character character : b.toCharArray()) {

            int count = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, (count - 1));
        }

        List<Integer> values = new ArrayList<>( map.values() );
        int total = 0;
        for( Integer v: values ) {
            total += Math.abs(v);
        }
        return total;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        System.out.println(res);

        scanner.close();
    }
}
