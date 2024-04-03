import java.util.*;
import java.io.*;
class User
{
	Scanner sc=new Scanner(System.in);
	//string r_name_file;
	User()
	{
		System.out.print("Enter the rename file...");
		String r_name_file=sc.nextLine();

		File f=new File("D:\\java\\unit-4\\abd.txt");
		File f1=new File("D:\\java\\unit-4\\"+r_name_file);
		if(f.exists())
		{
			System.out.println(f.renameTo(f1));
		}
		else
		{
			System.out.println("file not found...");
		}
	}
}
class U_rename
{
	public static void main(String[] args) 
	{
		User u=new User();
	}
}