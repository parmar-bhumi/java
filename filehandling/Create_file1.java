import java.io.*;
class Create_file1
{
	public static void main(String[] args) 
	{
		File f=new File("D:\\java\\unit-4\\Abc.txt");
		try
		{
			if(f.createNewFile())
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File does not create");
			}
		}
		catch(IOException ie)
			{
				System.out.println(ie);
			}	
	}
}