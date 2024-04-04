class Mca extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Atmiya...");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}
class Th1
{
	public static void main(String[] args) throws InterruptedException
	{
			Mca m=new Mca();
			m.start();

			for(int i=1;i<=5;i++)
			{
				System.out.println("University...");
				Thread.sleep(1000);
			}
	}
}