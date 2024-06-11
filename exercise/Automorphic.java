// 2.Write a program user through input one number and then check. This no is
// AutomorphicNumber or not. Using Constructor.
// Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625.
import java.util.*;
class Process
{
	Scanner sc=new Scanner(System.in);
	int no,sqr,s_r,temp,count=0;
	Process()
	{
		System.out.print("Enter number:");
		no=sc.nextInt();
	}
	void perform()
	{
		temp=no;
		sqr=temp*temp;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		s_r=sqr%(int)Math.pow(10,count);
		if(s_r==no)
		{
			System.out.println("This no is automorphic number:"+no);
		}
		else
		{
			System.out.println("This number is not automorphic number:"+no);
		}
	}
}
class Auto
{
	public static void main(String[] args) 
	{
		Process p=new Process();
		p.perform();	
	}
}



