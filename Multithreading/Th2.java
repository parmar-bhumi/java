//Runnable interface
class Mca implements Runnable
{
	public void run()
	{
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Mca students...");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}
class Th2
{
	public static void main(String[] args) throws InterruptedException
	{
		Mca m=new Mca();
		Thread t=new Thread(m);
		t.start();

		for(int i=1;i<=5;i++)
		{
			System.out.println("sem 2...");
			Thread.sleep(1000);
		}
	}
}