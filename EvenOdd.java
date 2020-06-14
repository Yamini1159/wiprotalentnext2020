import java.util.Scanner;
public class EvenOdd
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.pirntln("Enter a number:");
		int number = s.nextInt;
		
		if(number % 2 == 0)
		{
			System.out.println("The number is even " +number);
		}
		else
		{
			System.out.println("The number is odd " + number);
		}
	}
}