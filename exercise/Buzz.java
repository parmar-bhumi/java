//import java.util.*;
class Buzz
{
	public static void main(String[] args) 
	{
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter number:");
		// int number=sc.nextInt();
		int number=2345;
		 if (number % 10 == 7 || number % 7 == 0)
            System.out.println(number + " is a Buzz number.");
        else
            System.out.println(number + " is a not Buzz number.");	
	}
}