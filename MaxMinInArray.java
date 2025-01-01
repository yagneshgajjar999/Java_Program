import java.util.Scanner;
class MaxMinInArray
{
	public static void main(String ar[])
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int n = scanner.nextInt();
	int[] numbers = new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter number"+(i+1)+":");
		numbers[i]=scanner.nextInt();
	}
	int max=numbers[0];
	int min=numbers[0];
	for (int i=1;i<n;i++)
	{
		if(numbers[i]>max)
		{
			max=numbers[i];
		}
		if(numbers[i]<min)
		{
			min=numbers[i];
		}
	}
	System.out.println("Maximum:"+max);
	System.out.println("Minimum:"+min);
	}
	
}