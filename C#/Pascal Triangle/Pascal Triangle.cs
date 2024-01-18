public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        IList<IList<int>> pascalTriangle = new List<IList<int>>();

        for (int i = 0; i < numRows; i++) {
            List<int> row = new List<int>();

            for (int j = 0; j <= i; j++) {
                // First and last values in each row are 1
                if (j == 0 || j == i) {
                    row.Add(1);
                } else {
                    // addition of above values
                    row.Add(pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j]);
                }
            }
            pascalTriangle.Add(row);
        }
        return pascalTriangle;
    }
}