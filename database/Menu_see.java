import java.sql.*;
import java.util.*;
class Con
{
	Con()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/menud";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			if(con.isClosed())
			{
				System.out.println("Connection not created..");
			}
			else 
			{
				System.out.println("Connection is created...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class C_table 
{
	C_table()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/menud";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			String q="CREATE TABLE java (sid int(20) PRIMARY KEY AUTO_INCREMENT,marks VARCHAR(100)NOT NULL,name VARCHAR(100)NOT NULL)";
			Statement s=con.createStatement();
			s.executeUpdate(q);
			System.out.println("Table created...");
			con.close();
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
		Scanner sc=new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/menud";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			System.out.print("Enter the marks:");
			String smarks=sc.nextLine();
			System.out.print("Enter the name:");	
			String snm=sc.nextLine();
			String q="Insert into java (marks,name) values ('"+smarks+"','"+snm+"')";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.executeUpdate();
			System.out.println("Records inserted...");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			String url="jdbc:mysql://localhost:3306/menud";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			Statement s=con.createStatement();
			String q="select * from java";
			ResultSet rs=s.executeQuery(q);
			System.out.println("\t Student-ID \t Student-marks \t Student-Name");
			System.out.println("======================================================");
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
			String url="jdbc:mysql://localhost:3306/menud";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			Statement stmt=con.createStatement();
			System.out.print("Enter the record:");
			int s_r=sc.nextInt();
			String q="select * from java where sid='"+s_r+"'";
			ResultSet rs=stmt.executeQuery(q);
			System.out.println("\t Student-ID\t Student-marks \t Student-Name");
			System.out.println("====================================================");
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
			String url="jdbc:mysql://localhost:3306/menud";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			Statement s=con.createStatement();
			System.out.print("Enter update record:");
			int u_r=sc.nextInt();
			String q="select * from java where sid='"+u_r+"'";
			ResultSet rs=s.executeQuery(q);
			System.out.println("\t Student-ID \t Student-marks \t Student-Name");
			System.out.println("==================================");
			while(rs.next())
			{
				System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				System.out.println("-----------------------------------------------------------------");
			}
			String u_query="update java set marks='34',name='gfr' where sid='"+u_r+"'";
			int r_affect=s.executeUpdate(u_query);
			System.out.println("Row updated.."+r_affect);
			System.out.println("========================================");
			con.close();
		}
		catch(Exception e)
		{
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
			String url="jdbc:mysql://localhost:3306/menud";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			Statement s=con.createStatement();
			System.out.print("Enter delete record:");
			int u_r=sc.nextInt();
			String q="select * from java where sid='"+u_r+"'";
			ResultSet rs=s.executeQuery(q);
			System.out.println("\t Student-ID \t Student-marks \t Student-Name");
			System.out.println("==================================");
			while(rs.next())
			{
				System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				System.out.println("-----------------------------------------------------------------");
			}
			String d_query="delete from java where sid='"+u_r+"'";
			int r_affect=s.executeUpdate(d_query);
			System.out.println("Deleted record.."+r_affect);
			System.out.println("===========================");
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
		System.out.print("choose any one number:");
		int no=sc.nextInt();
		switch(no)
		{
		case 1:
			 new Con();
			 break;
		case 2:
			new C_table();
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
			System.out.println("Enter above choice");	 
		}
	}
}
class Menu 
{
	Menu()
	{
		System.out.println("Menu Driven:=====");
		System.out.println("1.connect DB");
		System.out.println("2.Create Table");
		System.out.println("3.Record insert");
		System.out.println("4.Display records");
		System.out.println("5.Search");
		System.out.println("6.Update");
		System.out.println("7.delete");
		System.out.println("8.Exit");
		System.out.println("========================");
	}
}
class Menu_see
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