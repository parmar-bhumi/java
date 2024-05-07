import java.sql.*;
class Ins_data
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

			String q="Insert into students (s_name,s_stream) values('bhumi','Mca')";

			PreparedStatement pstmt=con.prepareStatement(q);

			pstmt.executeUpdate();

			System.out.println("your data is inserted...");
			con.close();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    }
}