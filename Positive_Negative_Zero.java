import java.util.Scanner;
public class Positive_Negative_Zero
{
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = s.nextInt();
		if(n>0)
		{
			System.out.println("The number is " +n+ "Positive");
		}
		else if(n<0)
		{
			System.out.println("The number is " + n + "Negative");
		}
		else
		{
			System.out.println("The number is " + n + "Zero");
		}
	}
}