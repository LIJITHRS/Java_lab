import java.util.*;
class Average
{

public static void main(String args[])
{
	int Sum=0;
	int a[]=new int[10];
	int Avg=0;
	System.out.println("enter the limit:");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	
	System.out.println("Enter the numbers for finding average :");
	for (int i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	for (int i=0;i<n;i++)
	{
		Sum=Sum+a[i];
	}
		
	for(int i=0;i<n;i++)
	{
		Avg=Sum/n;
	}			

	System.out.println("Average of these numbers are:"+Avg);
}
}
