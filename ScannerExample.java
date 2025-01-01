import java.util.Scanner;
class ScannerExample
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int intValue=sc.nextInt();
		System.out.println("Your entered number is:"+intValue);
	}
}