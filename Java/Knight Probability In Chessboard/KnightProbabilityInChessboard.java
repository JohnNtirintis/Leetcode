class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        double knight[][][] = new double[n][n][k+1];
        // Possible Moves
        int[][] moves = {{-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1, -2}, {1, -2}, {-1, 2}, {1, 2}};

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                knight[i][j][0] = 1.0;
            }
        }

        // z is moves left
        for(int z = 1; z <= k; z++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    for(int[] move : moves){
                        int newI = i + move[0];
                        int newJ = j + move[1];
                        if(newI >= 0 && newI < n && newJ >= 0 && newJ < n){
                            // We have to sum up the probabilities
                            knight[i][j][z] += knight[newI][newJ][z - 1] / 8.0;
                        }
                    }
                }
            }
        }
        return knight[row][column][k];
    }
}