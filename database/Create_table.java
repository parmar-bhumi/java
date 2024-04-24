import java.sql.*;
class Create_table
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
			String q = "CREATE TABLE students (sid INT(20) PRIMARY KEY AUTO_INCREMENT, s_name VARCHAR(100) NOT NULL,s_stream VARCHAR(50) NOT NULL )";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);

			System.out.println("Table created...");
			con.close();			
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}