import java.util.Scanner;
class Loginpage
{
	public static void main(String arg[])
	{
		String username,password;
		String username1="Yagnesh",password1="1809";
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER YOUR USERNAME:");
		username =sc.nextLine();
		System.out.print("ENTER YOUR PASSWORD:");
		password =sc.nextLine();
			if(username.equals(username1))
				{
					if(password.equals(password1))
					{
						System.out.println("LOGIIN SUCCESSFUL");
					}
					else
					{
						System.out.println("INVALID PASSWORD");
					}
				}
			else
				{
					System.out.println("INVALID USERNAME");
				}		
	}
}