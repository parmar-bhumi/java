import java.util.*;
class Process
{
	int sqr,s_r,temp,no,count=0;
	Scanner sc=new Scanner(System.in);
	Process()
	{
		System.out.print("Enter no:");
		no=sc.nextInt();
	}
	void Perfrom()
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
			System.out.println("no is atmorphc");
		}
		else 
		{
			System.out.println("no is not atmorphc");
		}
	}
}
class Auto2
{
	public static void main(String[] args) {
		Process P=new Process();	
		P.Perform();
	}
}