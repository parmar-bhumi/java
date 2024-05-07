import java.sql.*;
class Con1
{
	public static void main(String[] args) 
	{
		try 
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mca";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			if(con.isClosed())
			{
				System.out.println("Connection not created...");
			}
			else 
			{
				System.out.println("Connection is created...");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}

