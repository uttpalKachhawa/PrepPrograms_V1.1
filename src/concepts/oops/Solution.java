package concepts.oops;

/**
 * @author 703238043 on Aug, 2020
 */
import java.util.*;

public class Solution {
    public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
        @Override
        public void putNewInnings(String player, int runs){
            // YOUR CODE HERE
            int run=0;
            if(player!=null){
                run=run+runs;
            }
            System.out.println("run = " + run);
        }

        @Override
        public double getAverageRuns(String player){
            // YOUR CODE HERE



            return 10;
        }

        @Override
        public int getInningsCount(String player) {

           Map<String, Integer> map=new HashMap<>();
           if(!map.containsKey(player)){
               map.put(player,1);
           }
           else {
               map.put(player,map.get(player)+1);
           }


            for (Map.Entry<String, Integer> val : map.entrySet()) {
                System.out.println("Element " + val.getKey() + " "
                        + "occurs"
                        + ": " + val.getValue() + " times");


            }

                return 1;
        }

         }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface PlayerStatisticsCollector {
        // This is an input. Make note of this player inning.  Runs is a non negative integer.
        void putNewInnings(String player, int runs);

        // Get the runs average(mathematical average) for a player
        double getAverageRuns(String player);

        // Get the total number of innings for the player
        int getInningsCount(String player);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
            final List<String> players = new ArrayList<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String player = tokens[0];
                players.add(player);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewInnings(player, runs);

            }

            for (String player : players) {
                System.out.println(
                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
            }

        }
        scanner.close();

    }
}
