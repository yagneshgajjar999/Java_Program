import java.util.*;
class Array6
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int [3][3];
		int arr2[][]=new int [3][3];
		System.out.print("Enter array Value:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.print("Enter array Value2:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+arr2[i][j]);
			}
			System.out.print("\n");
		}
		
	}
}