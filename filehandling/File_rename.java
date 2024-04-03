import java.io.*;
class Rename
{
	Rename()
	{
		File f=new File("D:\\java\\unit-4\\one.txt");
		File f1=new File("D:\\java\\unit-4\\abd.txt");
		if(f.exists())
		{
			System.out.println(f.renameTo(f1));
		}
		else
		{
			System.out.println("File not found...");
		}
	}
}
class File_rename
{
	public static void main(String[] args) 
	{
		Rename r=new Rename();	
	}
}