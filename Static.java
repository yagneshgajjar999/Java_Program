import java.util.Scanner;
class Static
 {
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int a = 1, b = 2;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) 
		{
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
 }