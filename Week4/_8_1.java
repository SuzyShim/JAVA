import java.util.Scanner;

public class _8_1{
	
    public static void main(String[] args){
    	// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] matrix = new double[3][4];
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = input.nextDouble();
            }
        }

        for(int col=0; col < matrix[0].length; col++)
        {
            System.out.println("sum of the elements at column " + col + " is " + sumColumn(matrix,col));
        }
    }
    public static double sumColumn(double[][] m, int col){
        double sum = 0;
        for(int row = 0; row < m.length; row++)
            sum += m[row][col];
        return sum;
    }
}