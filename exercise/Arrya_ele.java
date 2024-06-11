import java.util.*;
class Perform
{
		int n,i,j,k;
		Scanner sc=new Scanner(System.in);
		Perform()
		{
			System.out.print("Enter the size of the array: ");
			n=sc.nextInt();
			int a[]=new int[n+1];

			System.out.print("Enter "+n+" integers:");
			for(i=0;i<n;i++)
			{
 				a[i]=sc.nextInt();
			}
			System.out.print("Enter the element to be inserted: ");
			int e=sc.nextInt();

			System.out.print("Enter the position: ");
			int p=sc.nextInt();
			
			boolean flag=false;
			for(i=0;i<n;i++)
			{
				if(i+1==p)
				{
	 				for(j=n;j>i;j--)
 					{
	 					a[j]=a[j-1];
 					}
 					a[i]=e;
 					flag=true;
 					n++;
 					break;
				}
			}
			if(flag)
			{
	 			for(i=0;i<n;i++)
 				System.out.print(a[i]+" ");
			}
			else
			{
 				System.out.print("Position Invalid");
			}
		}
}
class Arrya_ele
{
	public static void main(String args[])throws InputMismatchException
	{
		Perform p=new Perform();
	} 
}