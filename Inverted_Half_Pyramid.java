class Inverted_Half_Pyramid
{
    public static void main(String ar[])
    {
        int n = 4;
        // for(int i = n;i>=1;i--)
        // {
        //     for(int j = 1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}