import java.io.*;
class Writer
{
	void Process()
	{
		try
		{
			FileWriter fw=new FileWriter("D:\\java\\unit-4\\abc.txt");
			try 
			{
				fw.write("Hello students...");
			}
			finally
			{
				fw.close();
			}
			System.out.println("file wrote....");
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
}
class File_writer
{
	public static void main(String[] args) 
	{
		Writer w=new Writer();
		w.Process();	
	}
}