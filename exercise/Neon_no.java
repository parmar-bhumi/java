//5.Write a program user through input one number and then check this number
// is neon or not. Using Constructor.
//Example: 9*9=81  8+1=9  This Number is Neon.

import java.util.*;
class Stu
{
	Scanner sc=new Scanner(System.in);
	int no,number;
	First()
	{
		System.out.println("Enter Number:");
		no=sc.nextInt();
	}
	void Second()
	{
		int no;
		if(no == 0)
		{
			return number == 0;
		}else
		{
			int digit = squre % 10;
			return isNeonNumber(square / 10, number - digit);
		}
	}
}
public class Neon_no
{
	public static void main(String[] args) 
	{
		int number=9;
		int square = number * number;
		if (isNeonNumber(square, number)) {
			System.out.println(number + " is a neon number");
		} else {
			System.out.println(number + " is not a neon number");
		}	
	}
}

