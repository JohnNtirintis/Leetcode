public class Solution {
    public int ClimbStairs(int n) {
        int[] climbStairsMemo = new int[n + 1];
        for(int i = 0; i < climbStairsMemo.Length; i++){
            climbStairsMemo[i] = -1;
        }
        int sum = 0;
        sum += SolveRecursive(n, climbStairsMemo);
        return sum;
    }

    public int SolveRecursive(int n, int[] arr){
        if(arr[n] != -1) return arr[n];
        if(n == 1) return 1;
        if(n == 2) return 2;

        arr[n] = SolveRecursive(n - 1, arr) + SolveRecursive(n - 2, arr);
        return arr[n];
    }
}