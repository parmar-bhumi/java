class Movie extends Thread
{
	int ticket=2,person;
	Movie (int person)
	{
		this.person=person;
	}
	public void run()
	{
		String m_nm=Thread.currentThread().getName();
		synchronized(this)
		{
			if(ticket>=person)
			{
				System.out.println("Ticket booked:"+m_nm);
				ticket=ticket-person;
			}
			else 
			{
				System.out.println("House-full");
			}
		}
	}
}
class Block_this
{
	public static void main(String[] args) 
	{
			Movie m=new Movie(1);

			Thread t1=new Thread(m);
			Thread t2=new Thread(m);
			Thread t3=new Thread(m);

			t1.setName("vivah");
			t2.setName("chello divas");
			t3.setName("khichdi");

			t2.start();
			try 
			{
				t2.join();
			}
			catch(InterruptedException ie){}
			t1.start();
			t3.start();
	}	
}

// output:--
// Ticket booked:chello divas
// Ticket booked:vivah
// House-full