import java.util.*;
import java.io.*;
class User
{
	Scanner sc=new Scanner(System.in);
	String u_write;
	User()
	{
		System.out.print("Enter word:");
		u_write=sc.nextLine();
	}
	void Process()
	{
		try 
		{
			FileWriter fw=new FileWriter("D:\\java\\unit-4\\abc.txt");
			try
			{
				fw.write(u_write);
			}
			finally
			{
				fw.close();
			}
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
}
class User_write
{
	public static void main(String[] args) 
	{
		User u=new User();
		u.Process();	
	}
}