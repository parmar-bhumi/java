import java.sql.*;
class Display
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mca";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);

			Statement stmt=con.createStatement();
			String q="Select * from students";
			ResultSet rs=stmt.executeQuery(q);

			System.out.println("\t Student-Id \t Student-Name \t Student Stream");
			System.out.println("==============================================================\n");
			while(rs.next())
			{
				System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
				System.out.println("\t-------------------------------------------------------------\n");
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}
