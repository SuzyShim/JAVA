import java.util.Scanner;

public class _8_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int rac = 4;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		double[][] matrix = new double[rac][rac];
		for(int i = 0; i < rac; i++)
		{
			for(int j = 0; j < rac; j++)
			{
				matrix[i][j] = input.nextDouble();
			}
		}
		
        System.out.println("sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
        
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for(int i = 0; i < m.length; i++)
			sum += m[i][i];
		return sum;
	}
	
}
