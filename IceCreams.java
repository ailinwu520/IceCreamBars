/**
 * @author Ailin
 */
public class IceCreams {

    /**
     * Finds the maximum number of ice cream bars you can buy within a budget.
     *
     * Strategy: sort costs cheapest-first using selection sort, then greedily
     * buy bars from cheapest to most expensive until the budget is exhausted.
     *
     * @param costs   array of ice cream bar costs (unsorted)
     * @param dollars total budget available
     * @return maximum number of ice cream bars that can be purchased
     */
    public int maxIceCreams(int[] costs, int dollars) {

        // Phase 1: sort costs in ascending order using selection sort
        for (int i = 0; i < costs.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < costs.length; j++) {
                if (costs[j] < costs[minIdx]) {
                    minIdx = j;
                }
            }
            // swap the minimum element into its sorted position
            int temp = costs[minIdx];
            costs[minIdx] = costs[i];
            costs[i] = temp;
        }

        // Phase 2: buy bars from cheapest to most expensive until budget runs out
        int count = 0;
        int totalCost = 0;
        for (int i = 0; i < costs.length; i++) {
            totalCost += costs[i];
            if (totalCost > dollars) {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        IceCreams bars = new IceCreams();
        int[] costs = {1, 3, 2, 4, 1};
        int dollars = 7;
        System.out.println("Max ice cream bars purchasable: " + bars.maxIceCreams(costs, dollars));
    }
}
