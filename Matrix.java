import java.util.Scanner;
class Matrix
{
	public static void main(String args[])
	{
		Scanner mat=new Scanner(System.in);
		System.out.println("Enter the limit of matrix:");
		int n=mat.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		System.out.println("Enter elements in matrix 1:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=mat.nextInt();
			}
		}
		System.out.println("Enter elements in matrix 2:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=mat.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Sum of two matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
