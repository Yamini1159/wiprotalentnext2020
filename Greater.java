import java.util.Scanner;
public class Greater
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n1 , n2;
		System.out.println("Enter the first number:");
		n1 = s.nextInt();
		System.out.println("Enter the second number:");
		n2 = s.nextInt();
		
		if(n1 > n2)
		{
			System.out.println("\n The largest number = " + n1);
		}
		else 
		{
			System.out.println("\n The largest number = " + n2);
		}
	}
}
		