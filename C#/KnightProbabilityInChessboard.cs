public class Solution {
    double[,,] knight;
    int[][] moves = new int[][] {
        new int[] {-2, -1},
        new int[] {-2, 1},
        new int[] {2, -1},
        new int[] {2, 1},
        new int[] {-1, -2},
        new int[] {1, -2},
        new int[] {-1, 2},
        new int[] {1, 2}
    };
    
    public double KnightProbability(int n, int k, int row, int column) {
        knight = new double[n, n, k + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int z = 0; z <= k; z++){
                    knight[i, j, z] = -1.0;
                }
            }
        }
        return solve(n, k, row, column);
    }
    
    public double solve(int n, int k, int row, int column) {
        if(row < 0 || row >= n || column < 0 || column >= n){
            return 0.0;
        }
        if(k == 0){
            return 1.0;
        }
        if(knight[row, column, k] != -1.0){
            return knight[row, column, k];
        }
        double prob = 0.0;
        foreach(int[] move in moves){
            prob += solve(n, k - 1, row + move[0], column + move[1]) / 8.0;
        }
        knight[row, column, k] = prob;
        return prob;
    }
}
