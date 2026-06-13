class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Add the primary diagonal element
            sum += mat[i][i];

            // Add the secondary diagonal element
            // We only add it if it is not the same as the primary diagonal element
            // The secondary diagonal column index is (n - 1 - i)
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }
}