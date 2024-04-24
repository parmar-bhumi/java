import java.sql.*;
import java.util.*;
class Tab
{
	Tab()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");			
			String url="jdbc:mysql://localhost:3306/mca";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			String query="create table Details(id int(20) primary key auto_increment,name varchar(255) not null,stream varchar(255) not null)";
			Statement s=con.createStatement();
			s.executeUpdate(query);
			System.out.println("Table Created");
			System.out.println("=================================================");
			con.close();
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Con
{
	Con()
	{
		try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/mca";
				String unm="root";
				String pwd="";
				Connection con=DriverManager.getConnection(url,unm,pwd);
				if(con.isClosed())
				{
					System.out.println("Not Created");
				}
				else
				{
					System.out.println("Connection created");
					System.out.println("=========================================");
				}
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Ins
{
	Ins()
	{
		try
		{
				
			Class.forName("com.mysql.cj.jdbc.Driver");	
			String url="jdbc:mysql://localhost:3306/mca";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			String query="INSERT into Details(id ,name ,stream )values(101,'Vishakha','MCA')";
			PreparedStatement ps= con.prepareStatement(query);
			ps.executeUpdate();
			System.out.println("Data Inserted");
			System.out.println("===================================================");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Choice
{
	Choice()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Choose Any One No: ");
		int no=sc.nextInt();
		switch(no)
		{
		case 1:
			new Con();
			break;
		case 2:
			new Tab();
			break;
		case 3:
			new Ins();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Please Enter Above Choice Number");
	}
}
}
class Menu
{
	Menu()
	{
		System.out.println("MENU Driven");
		System.out.println("1.Connect DB");
		System.out.println("2.Create Table");
		System.out.println("3.Insert Data");
		System.out.println("4.Exit");
		System.out.println("=======================");
	}
}
class Menu_d
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Menu m=new Menu();
			Choice c=new Choice();
		}
	}
}