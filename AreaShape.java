import java.util.*;
class Area1
{
	void area(int x)
	{
		System.out.println("The area of the square is: " +x*x+ "sq units");
	
	}
	void area (int x,int y)
	{
	System.out.println("The area of the rectangle is: " +x*y+ " sq inits");
	}
	void area(double x)
	{
		double z=3.14*x*x;
		System.out.println("The area of the circle is: " +z+" sq inits");
	}
}







class AreaShape
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Area1 obj=new Area1();
		System.out.println("Enter side of the square:");
		int side=sc.nextInt();
		obj.area(side);
		
		System.out.println("Enter radius of circle:");
		double r=sc.nextInt();
		obj.area(r);
		
		System.out.println("Enter length and breadth of the rectangle:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		obj.area(l,b);
		
	}
}


