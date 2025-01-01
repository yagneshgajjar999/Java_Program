import java.util.Scanner;
class Choose
{
	static void addition(int a,int b)
	{
		System.out.println("addition is:"+(a+b));
	}
	static void subtraction(int a,int b)
	{
		System.out.println("sbtraction is:"+(a-b));
	}
	public static void main(String ar[])
	{
		int num1,num2,choice;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your first number:");
	num1=sc.nextInt();
	System.out.println("enter your second number:");
	num2=sc.nextInt();
	System.out.println("enter your choice:");
	choice=sc.nextInt();
	switch(choice)
	{
		case 1:addition(num1,num2);
				break;
		case 2:subtraction(num1,num2);
				break;
		default:
		System.out.println("enter a valid values");
	}
}}