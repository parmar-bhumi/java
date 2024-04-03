import java.util.*;
import java.io.*;
class User
{
	Scanner sc=new Scanner(System.in);
	String f_nm;
	User()
	{
		System.out.print("Enter file name(.txt):");
		f_nm=sc.nextLine();
	}
	void c_new_file() throws IOException 
	{
		File f=new File("D:\\java"+f_nm);
		if(f.createNewFile())
		{
			System.out.println("File created");
		}
		else
		{
			System.out.println("File not created");
		}	
	}
}
class U_create_file
{
	public static void main(String[] args) throws IOException 
	{
		User u=new User();
		u.c_new_file();
	}
}