enum Months
{
	jan(31),feb(29),Mar(31);

	int no_of_day;
	Months(int no_of_day)
	{
		this.no_of_day=no_of_day;
	}
	int day()
	{
		return no_of_day;
	}
}
class Enum2
{
	public static void main(String[] args) throws InterruptedException
	{
			for(Months m:Months.values())
			{
				Thread.sleep(1000);
				System.out.println((m.ordinal()+1)+"Months:"+m.name()+"--->"+"Days"+m.no_of_day+"\n");
			}
	}
}