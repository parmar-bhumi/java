enum Mca
{
	Sem1(6),sem2(5),sem3(4),sem4(1);
	int no_of_sub;

	Mca(int no_of_sub)
	{
		this.no_of_sub=no_of_sub;
	} 

	int Sem()
	{
		return no_of_sub;
	}
}

class Enum1
{
	public static void main(String[] args) throws InterruptedException
	{
		Mca m1=Mca.sem2;
		System.out.println("semester:"+m1.name()+"Total number of subject:"+m1.no_of_sub+"\n");
		for(Mca m:Mca.values())
		{
			Thread.sleep(1000);
			System.out.println((m.ordinal()+1)+"semester:"+m.name()+"Total number of subjects:"+m.no_of_sub+"\n");
		}
	}
}