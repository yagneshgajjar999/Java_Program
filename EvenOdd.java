import java.util.Scanner;
class EvenOdd
{
	public static void  main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int Starting;
		int Ending;
		System.out.println("Enter Starting Value");
		Starting=sc.nextInt();
		System.out.println("Enter Ending Value");
		Ending=sc.nextInt();
		for(Starting=0;Starting<=Ending;Starting++)
		{
			if(Starting%2==0)
			{
				System.out.println(Starting);
			}
			else
			{
				
			}
		}
	}
}