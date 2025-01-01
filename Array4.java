import java.util.Scanner;
class Array4
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int starting;
		int ending;
		System.out.println("Enter Starting:");
		starting = sc.nextInt();
		System.out.println("Enter Ending:");
		ending = sc.nextInt();
		int temp=0;
		int temp2=0;
		int even[]=new int[100];
		int odd[]=new int[100];
			for(int i=starting;i<=ending;i++)
			{
				if(i%2==0)
				{
					even[temp]=i;
					temp++;
				}
				else
				{
					odd[temp]=i;
					temp2++;
				}
			}
			for(int i=0;i<=temp;i++)
			{
				System.out.println(even[i]);
			}
			for(int i=starting;i<=ending;i++)
			{
				if(i%2==0)
				{
					even[temp]=i;
					temp++;
				}
				else
				{
					odd[temp]=i;
					temp2++;
				}
			}
			for(int i=0;i<=temp2;i++)
			{
				System.out.println(odd[i]);
			}
	}
}