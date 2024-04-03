package pack;
import java.util.*;

public class User{
	public User()
	{
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter number:");
		int name=sc.nextInt();

		if(name>10){
			System.out.println("Not allowed");
		}
	}
}