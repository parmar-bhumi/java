import java.sql.*;
import java.util.*;
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
class Ins extends Con
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
			String query="INSERT into Details(name ,stream )values('bhumi','MCA')";
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
class Dis
{
	Dis()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			String url="jdbc:mysql://localhost:3306/mca";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			Statement stmt=con.createStatement();
			String q="select * from details";
			ResultSet rs=stmt.executeQuery(q);
			System.out.println("\t Student-ID \t Student-Name \t STUDENT STREAM");
			System.out.println("=================================================================");
			while(rs.next())
			{
				System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				System.out.println("---------------------------------------------------------------");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Search
{
	Search()
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			String url="jdbc:mysql://localhost:3306/mca";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			Statement s=con.createStatement();
			System.out.print("Enter Search Record:");
			int s_r=sc.nextInt();
			String q="select * from details where id='"+s_r+"'";
			ResultSet rs=s.executeQuery(q);
			System.out.println("\t Student-ID \t Student-Name \t STUDENT STREAM");
			System.out.println("===============================================");
			while(rs.next())
			{
				System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				System.out.println("---------------------------------------------------------------");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Update
{
	Update()
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			String url="jdbc:mysql://localhost:3306/mca";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			Statement s=con.createStatement();
			System.out.print("Enter update Record:");
			int s_r=sc.nextInt();
			String q="select * from details where id='"+s_r+"'";
			ResultSet rs=s.executeQuery(q);
			System.out.println("\t Student-ID \t Student-Name \t STUDENT STREAM");
			System.out.println("===============================================");
			while(rs.next())
			{
				System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				System.out.println("---------------------------------------------------------------");
			}
			String u_query="UPDATE details SET name='priya',stream='mba' where id='"+s_r+"'";
			int r_affect=s.executeUpdate(u_query);
			System.out.println("Record updated.."+r_affect);
			con.close(); 
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
class Delete
{
	Delete()
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			String url="jdbc:mysql://localhost:3306/mca";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			Statement s=con.createStatement();
			System.out.print("Enter delete record:");
			int s_r=sc.nextInt();
			String q="select * from details where id='"+s_r+"'";
			ResultSet rs=s.executeQuery(q);
			System.out.println("\t  Student-ID \t Student-Name \t Student-stream");
			System.out.println("=====================================================");
			while(rs.next())
			{
				System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				System.out.println("---------------------------------------------------------------");
			}
			String d_query="DELETE from details where id='"+s_r+"'";
			int r_affect=s.executeUpdate(d_query);
			System.out.println("Raw deleted:"+r_affect);
			System.out.println("==================================");
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
			new Dis();
			break;
		case 5:
			new Search();
			break;
		case 6:
			new Update();
			break;
		case 7:
			new Delete();
			break;				
		case 8:
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
		System.out.println("MENU Driven:=======");
		System.out.println("1.Connect DB");
		System.out.println("2.Create Table");
		System.out.println("3.Insert Data");
		System.out.println("4.Display");
		System.out.println("5.Search");
		System.out.println("6.Update");
		System.out.println("7.Delete");
		System.out.println("8.Exit");
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