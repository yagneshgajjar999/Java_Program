import java.util.Scanner;
class AgeException
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter your age:");
        i = sc.nextInt();
        if(i<18)
        {
            System.out.println("Your age is invalid");
        }
        else if(i>=18)
        {   
            System.out.println("Your age is valid");
            System.out.println("Completed");
        }
    }
}