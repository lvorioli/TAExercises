package exercises;

public class ProblemSet {
	//EXERCISE 1
	public double[][] matrixConstructor(int rows, int cols, double[] numbers) {
			
	}
		
	//EXERCISE 2
	public double[][] matrixAdd(double[][] matrix1, double[][] matrix2) {
			
	}
		
	//EXERCISE 3
	public double[][] transpose(double[][] matrix) {
		
	}
		
	//EXERCISE 4
	public double[][] matrixMultiply(double[][] matrix1, double[][] matrix2) {
			
	}
		
	//EXERCISE 5
	public double determinant(double[][] matrix){
			
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
		/*TESTS
		System.out.println(ps.determinant(new double[][]{{1,3,4},{5,2,5},{2,4,5}}));
		viewMatrix(ps.matrixAdd(new double[][] {{4,3,3},{2,4,6}}, new double[][] {{1,3,4},{2,1,4}}));
		viewMatrix(ps.matrixMultiply(new double[][] {{2,1,4},{0,1,1}}, new double[][] {{6,3,-1,0},{1,1,0,4},{-2,5,0,2}}));
		viewMatrix(ps.matrixConstructor(3, 4, new double[] {1,2,3,4,5,6,7,8,9,10,11,12}));
		viewMatrix(ps.transpose(new double[][] {{1,5,3,6},{2,9,1,9}}));*/
	}
}
