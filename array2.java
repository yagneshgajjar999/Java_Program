import java.util.Scanner;
class array2
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
        for (int i = 0; i <= 3; i++) 
		{
            System.out.println(arr[i] + arr[i+1]);
        }
	}
}
// 10 20 30 40 50 
// 10 30 50 70 90