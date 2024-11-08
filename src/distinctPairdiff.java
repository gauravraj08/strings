import java.util.HashSet;

public class distinctPairdiff {
    public static int countDistinctPairs(int[] projectCosts, int target) {
        HashSet<Integer> costsSet = new HashSet<>();
        HashSet<String> uniquePairs = new HashSet<>();

        for (int cost : projectCosts) {
            // Check if we have already seen a cost that could form a valid pair with the current cost
            if (costsSet.contains(cost + target)) {
                uniquePairs.add(Math.min(cost, cost + target) + "," + Math.max(cost, cost + target));
            }
            if (costsSet.contains(cost - target)) {
                uniquePairs.add(Math.min(cost, cost - target) + "," + Math.max(cost, cost - target));
            }
            // Add current cost to the set
            costsSet.add(cost);
        }

        // The number of unique pairs
        return uniquePairs.size();
    }

    public static void main(String[] args) {
        int[] projectCosts = {1, 3, 5};
        int target = 2;
        System.out.println("Number of distinct pairs: " + countDistinctPairs(projectCosts, target));
    }
}
