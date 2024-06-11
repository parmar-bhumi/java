import java.util.*;
interface User
{
	void input();
	void output();
}
class Process implements User
{
	Scanner sc=new Scanner(System.in);
	String emp_nm;
	double sal;
	public void input()
	{
		System.out.println("Input\n");
		System.out.print("Enter employee name:");
		emp_nm=sc.nextLine();

		System.out.print("Enter employee salary:");
		sal=sc.nextDouble();
	}
	public void output()
	{
		System.out.println("Output\n");
		System.out.println("Employee name:"+emp_nm);
		System.out.println("Employee salary:"+sal);
	}
}
class Emp
{
	public static void main(String[] args) {
		User u=new user();
		u.input();
		u.output();
	}
}