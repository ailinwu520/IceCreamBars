/**
 * @author Ailin
 */
public class IceCreams {
    /**
     * find the maximum ice cream bars you can buy
     * @param costs array of costs of all ice cream bars, unsorted
     * @param dollars the total amount of dollars you can use to buy the ice cream 
     * return how many ice cream can buy with the money
     */
    public int maxIceCreams(int[] costs, int dollars) {
        // for each element in unsorted
        //initialize result
        int count = 0;
        int sum = 0;
        for (int i = 0; i < costs.length; i++){
            // find min element in unsorted
            int min_idx = i;
            for (int j = i; j < costs.length; j++) {
                if (costs[j] < costs[min_idx]) {
                    min_idx = j;
                    // swap min element and first element
                    int temp = costs[min_idx];
                    costs[min_idx] = costs[i];
                    costs[i] = temp;
                }
            }
        }

        for (int i = 0; i < costs.length; i++) {
            sum += costs[i];
            if (sum <= dollars) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        IceCreams bars = new IceCreams();
        int[] costs = {1,3,2,4,1};
        int dollars = 7;
        System.out.println(bars.maxIceCreams(costs, dollars));
//        System.out.println("The maximum number of ice cream bars that " +
//                "professor Brizan can buy with dollars is: " + bars.maxIceCreams(costs, dollars));
    }
}
