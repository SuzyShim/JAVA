import java.util.Scanner;
 
public class _8_13{
	
	public static void main(String args[]){
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array: ");
		
		int rows = input.nextInt();
		int columns = input.nextInt();
		double[][] a = new double[rows][columns];
		
		System.out.println("Enter the array: ");
		for(int i = 0; i < rows; ++i)
		{
			for(int j = 0; j < columns; ++j)
			{
				a[i][j] = input.nextDouble();
			}
		}
		
		int[] result = new int[2];
		result = locateLargest(a);
		System.out.println("The location of the largest element is at " + "(" + result[0] + "," + result[1] + ")");
	}
	
	public static int[] locateLargest(double[][] a){
		int[] result = new int[2];
		double max = 0;
		for(int i = 0; i < a.length; ++i){
			for(int j = 0; j < a[i].length; ++j){
				if(a[i][j] > max){
					max = a[i][j];
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}
}
