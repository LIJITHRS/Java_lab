import java.util.Scanner;
class Array
{	
	
	public static void main(String args[])
	{
	int Sum=0;
	int a[]=new int[10];
	System.out.println("enter the limit:");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	System.out.println("Enter the numbers for addition:");
	for (int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		Sum=Sum+a[i];
	}
	System.out.println("Sum of these numbers are:"+Sum);
	}
}
