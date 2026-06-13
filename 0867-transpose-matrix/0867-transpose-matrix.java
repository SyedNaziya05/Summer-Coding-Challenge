class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Create a new matrix with dimensions n x m
        int[][] transposedMatrix = new int[n][m];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Assign the element to the swapped index position
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        
        return transposedMatrix;
    }
}