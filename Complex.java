import java.util.*;
class Comp_num{
	int a,b;
	
	Comp_num(int a,int b)
	{
		this.a=a;
		this.b=b;

		
	}
	
	


}
class Complex
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first real number:");
		int a=in.nextInt();
		
		System.out.println("Enter the first image number ");
		int b=in.nextInt();
		Comp_num C1 =new Comp_num(a,b);
		
	
		System.out.println("Enter the second real number:");
		a=in.nextInt();
		
		System.out.println("Enter the second image number ");
		b=in.nextInt();
		
		Comp_num C2 =new Comp_num(a,b);
		
		int real=C1.a + C2.a;
		int image=C2.b + C2.b;
		System.out.println("Complex number is:"+real+"+"+image+"i");
		
	}

}
