import java.util.Scanner;
class ManualExample
{
	public static void main(String ar[])
	{
		
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter number i:");
		i = sc.nextInt();
			if(i%2==0)
			{
				System.out.println("Number is even");
			}
			else
			{
				System.out.println("Number is odd");
			}
			
	}
}