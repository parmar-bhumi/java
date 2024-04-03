import java.util.*;
import java.io.*;
class Table
{
	Scanner sc=new Scanner(System.in);
	int t_no;
	Table()
	{
		System.out.print("Enter table number:");
		t_no=sc.nextInt();
	}
	void t_process()
	{
		try 
		{
			FileWriter  fw=new FileWriter("D:\\java\\unit-4\\abc.txt");
			try 
			{
				for(int i=1;i<=10;i++)
				{
					fw.write(t_no+"*"+i+"="+(t_no*i)+"\n\n");
				}
			}
			finally
			{
				fw.close();
			}
			System.out.println("Table is created...");
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
}
class File_table
{
	public static void main(String[] args) 
	{
			Table t=new Table();
			t.t_process();
	}
}