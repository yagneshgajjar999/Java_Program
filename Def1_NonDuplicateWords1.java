// The text file is passed as a command line argument
import java.io.*;
import java.util.*;
class Def1_NonDuplicateWords1
{
	public static void main(String args[])
	{
		if(args.length ==1)
		{
			String fileName = args[0];
			TreeSet < String > set = new TreeSet < > ();
			File file=new File(fileName);
			try
			{
				Scanner s=new Scanner(file);
				while(s.hasNext())
				{
					set.add(s.next());
				}
				TreeSet<String> st=(TreeSet<String>)set.descendingSet();
				for(String a:st)
				System.out.println(a);	
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		else
			{
				System.out.println("Please, Pass the File Name as Command Line Argument");
			}
	}
}
