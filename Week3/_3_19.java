import java.util.Scanner;

public class _3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.print("�����������ε�������:");
	    
	    double side1 = input.nextDouble();
	    double side2 = input.nextDouble();
	    double side3 = input.nextDouble();

	    if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1))
	    {
	        System.out.println("�������ܳ�Ϊ��" + (side1 + side2 + side3));
	    }
	    else
	    {
	        System.out.println("���ܹ���������");
	    }
	}
}
