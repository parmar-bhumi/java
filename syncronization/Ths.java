class Bus extends Thread
{
	int seat=1,passenger;
	Bus(int passenger)
	{
		this.passenger=passenger;
	}

	
	public synchronized void run()
	{
		String nm=Thread.currenrThread().getName();
		if(seat>=passenger)
		{
			System.out.println(nm+" Your ticket is booked...");
		}
		else 
		{
			System.out.println("sorry ticket is not booked..."+nm);
		}
	}
}
class Ths
{
	public static void main(String[] args) 
	{
		Bus b=new Bus(1);

		Thread t1=new Thread(b);	
		Thread t2=new Thread(b);	
		Thread t3=new Thread(b);

		t1.setName("hgg");	
		t2.setName("hgt");	
		t3.setName("hgu");

		t1.start();	
		t2.start();	
		t3.start();	
	}
}