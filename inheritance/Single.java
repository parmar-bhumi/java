import java.util.*;
class First
{
	 Scanner sc=new Scanner(System.in);
	 int no[]=new int[5];
	 First()
	 {
	 	for(int i=0;i<no.length;i++)
	 	{
	 		System.out.print("Enter no:"+i+"->");
	 		no[i]=sc.nextInt();
	 	}
	 }
}
class Dis extends First
{
	Dis()
	{
		System.out.println("\n Display array");
		int t=0;
		for(int i=0;i<no.length;i++)
		{
			System.out.println(i+"->number is:"+no[i]);
			t=t+no[i];
		}
		System.out.println("\n Total is:"+t);
	}
}
class Single
{
	public static void main(String[] args) {
		Dis d=new Dis();
	}
}

