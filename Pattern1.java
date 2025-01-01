class Pattern1
{
	public static void main(String ar[])
	{
		int n = 5;
		for(int i = 1; i <= n; i++)
		{
			// Print Spaces
			for (int j = i; j < n; j++)
			{
				System.out.print(" ");
			}
			// Print Stars
			for (int j = 1;j <= (2 * i - 1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}