import java.util.Scanner;
public class SumEvenOdd
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num1 , num2 , sum;
		System.out,println("The number1 " +num1 + " is ");
		num1 = s.nextInt();
		System.out.println("The number2 " + num2 + " is " );
		num2 = s.nextInt();
		System.out.println("The sum of numbers " + sum + "is ");
		sum = num1 +num2;
		
		if(sum % 2 == 0)
		{
			System.out.println("The sum is Even");
		}
		else
		{
			System.out.println("The sum is Odd ");
		}
	}
}