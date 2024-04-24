import java.sql.*;
import java.util.*;
class Ins
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mca";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);

			System.out.print("Enter student name:");
			String snm=sc.nextLine();

			System.out.print("Enter student stream:");
			String stream=sc.nextLine();

			String q="Insert into students (s_name,s_stream) values('"+snm+"','"+stream+"')";

			PreparedStatement pstmt=con.prepareStatement(q);

			pstmt.executeUpdate();

			System.out.println("Your data is inserted...");
			con.close();
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}