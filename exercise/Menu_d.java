import java.util.*;
import java.io.*;
import java.io.IOException;
class Scan
{
	Scanner sc=new Scanner(System.in);
}
class CreateFile
{
	CreateFile()
	{
		try 
		{
			File f=new File("bhumi.txt");
			if(f.createNewFile())
			{
				System.out.println("file created.."+f.getName());
			}
			else 
			{
				System.out.println("file exists..");
			}
		}
		catch(IOException ie)
		{
			System.out.println(ie);
			System.out.println("error");
		}
	}
}
class Writefile extends Scan
{
	Writefile()
	{
		try 
		{
			FileWriter f=new FileWriter("bhumi.txt");
			try 
			{
				f.write("atmiya university..");
			}
			finally
			{
				f.close();
			}
			System.out.println("succesfully write...");
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
}
class ReadFile
{
	ReadFile()
	{
		try 
		{
			FileReader fr=new FileReader("bhumi.txt");
			try 
			{
				int i;
				while((i=fr.read())!=-1)
				{
					System.out.println((char)i);
				}
				System.out.println("\n");
			}
			finally
			{
				fr.close();
			}
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}
	}
} 
class RenameFile
{
	RenameFile()
	{
		File f=new File("bhumi.txt");
		File r=new File("bhumir.txt");
		if(f.exists())
		{
			System.out.println(f.renameTo(r));
			System.out.println("file rename"+r.getName());
		}
		else 
		{
			System.out.println("not exists..");
		}
	}

}
class DeleteFile
{
	DeleteFile()
	{
		File f=new File("bhumir.txt");
		if(f.delete())
		{
			System.out.println(f.getName()+"deleted");
		}
	}
}

class Choise extends Scan
{
	Choise()
	{
		System.out.print("Enter choice..");
		int no=sc.nextInt();
		switch(no)
		{
		case 1:
			new CreateFile();
			break;
		case 2:
			new Writefile();
			break;
		case 3:
			new ReadFile();
			break;	
		case 4:
			new DeleteFile();
			break;
		case 5:
			new RenameFile();
			break;			
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("enter above choice..");			
		}
	}
}
class Menu
{
	Menu()
	{
		System.out.println("Menu driven..");
		System.out.println("1.create file");
		System.out.println("2.Write");
		System.out.println("3.Read");
		System.out.println("4.Delete");
		System.out.println("5.Rename");
		System.out.println("6.exit");
	}
}
class Menu_d
{
	public static void main(String[] args) 
	{
		while(true)
		{
			new Menu();
			new Choise();
		}	
	}
}