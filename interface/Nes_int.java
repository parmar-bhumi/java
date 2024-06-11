import java.util.*;
interface Table
{
	interface Process
	{
		void dis();
	}
}
class Tab_dis implements Table.Process
{
	Scanner sc=new Scanner(System.in);
	int t_no;
	Tab_dis()
	{
		System.out.print("Enter table number:");
		t_no=sc.nextInt();
	}
	public void dis()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(t_no+"*"+i+"="+(t_no*i));
		}
	}
}
class Nes_int
{
	public static void main(String[] args) throws InterruptedException
	{
		Table.Process tp=new Tab_dis();
		Thread.sleep(1000);
		tp.dis();	
	}
}