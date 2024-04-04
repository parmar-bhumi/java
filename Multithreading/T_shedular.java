class Mca extends Thread
{
	@Override
	public void run()
	{
		String th_nm=Thread.currentThread().getName();
		try 
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(th_nm);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}
class T_shedular
{
	public static void main(String[] args) 
	{
		Mca m1=new Mca();
		Mca m2=new Mca();
		Mca m3=new Mca();

		m1.setName("Thread-1");
		m2.setName("Thread-2");
		m3.setName("Thread-3");

		m1.start();
		m2.start();
		m3.start();
	}
}