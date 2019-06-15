package exercises;

public class ProblemSet {
	//EXERCISE 1
	public double[][] matrixConstructor(int rows, int cols, double[] numbers) {
		double[][] matrix = new double[rows][cols];
		int x = 0;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix[i][j] = numbers[x++];
			}
		}
		return matrix;
	}
	
	//EXERCISE 2
	public double[][] matrixAdd(double[][] matrix1, double[][] matrix2) {
		int n = matrix1.length;
		int m = matrix1[0].length;
		double[][] matrix = new double[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return matrix;
	}
	
	//EXERCISE 3
	public double[][] transpose(double[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		double[][] transposeMatrix = new double[m][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				transposeMatrix[j][i] = matrix[i][j];
			}
		}
		return transposeMatrix;
	}
	
	//EXERCISE 4
	public double[][] matrixMultiply(double[][] matrix1, double[][] matrix2) {
		int n = matrix1.length;
		int m = matrix1[0].length;
		int k = matrix2[0].length;
		double[][] matrix = new double[n][k];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				double z = 0;
				for(int x = 0; x < m; x++) {
					z += matrix1[i][x] * matrix2[x][j]; 
				}
				matrix[i][j] = z;
			}
		}
		return matrix;
	}
	
	//EXERCISE 5
	public double determinant(double[][] matrix){
		double determinant = 0.00;
		int n = matrix.length;
		int m = matrix[0].length;
		if(n == 1) {
			return matrix[0][0];
		}
		for(int i = 0; i < m; i++) {
			double[][] matrix2 = new double[n - 1][m - 1];
			int l = 0;
			int k = 0;
			for(int x = 1; x < n; x++) {
				for(int y = 0; y < m; y++) {
					if(y != i) {
						matrix2[l][k++] = matrix[x][y];
					}
				}
				l++;
				k = 0;
			}
			if(i % 2 == 0) {
				determinant += (matrix[0][i] * determinant(matrix2));
			}
			else {
				determinant -= (matrix[0][i] * determinant(matrix2));
			}
			
		}
		return determinant;
	}
	
	public static void viewMatrix(double[][] matrix) {
		for(double[] row: matrix) {
			for(double element: row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		ProblemSet ps = new ProblemSet();
		System.out.println(ps.determinant(new double[][]{{1,3,4},{5,2,5},{2,4,5}}));
		viewMatrix(ps.matrixAdd(new double[][] {{4,3,3},{2,4,6}}, new double[][] {{1,3,4},{2,1,4}}));
		viewMatrix(ps.matrixMultiply(new double[][] {{2,1,4},{0,1,1}}, new double[][] {{6,3,-1,0},{1,1,0,4},{-2,5,0,2}}));
		viewMatrix(ps.matrixConstructor(3, 4, new double[] {1,2,3,4,5,6,7,8,9,10,11,12}));
		viewMatrix(ps.transpose(new double[][] {{1,5,3,6},{2,9,1,9}}));
	}
}
