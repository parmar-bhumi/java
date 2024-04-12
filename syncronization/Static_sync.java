class Salary extends Thread
{
	public static synchronized void Withdraw()
	{
		String e_nm=Thread.currentThread().getName();
		try
		{
			System.out.println("Employee name:"+e_nm+"50000/-");
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){}
	}
		@Override
		public void run()
		{
			Withdraw();
		}
}
class Static_sync
{
	public static void main(String[] args) 
	{
		Salary s1=new Salary();	
		Salary s2=new Salary();	
		Salary s3=new Salary();

		s1.setName("bhumi");
		s2.setName("krisu");
		s3.setName("yachu");

		s1.start();
		s2.start();
		s3.start();
	}
}