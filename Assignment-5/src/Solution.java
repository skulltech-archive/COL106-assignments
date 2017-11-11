public class Solution {
    private Board initial;
    private Board goal;
    private int[] cost;

    private Solution(String initial, String goal, String cost) {
        this.initial = new Board(initial);
        this.goal = new Board(goal);

        int N = initial.length() - 1;
        this.cost = new int[N];

        for (int i = 0; i < N; i++) {
            char c = cost.charAt(i);
            this.cost[i] = Character.getNumericValue(c);
        }
    }
}