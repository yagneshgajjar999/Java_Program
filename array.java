import java.util.Scanner;
class array
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<=4;i++)
		{
			System.out.print("Enter value:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}
	}
}