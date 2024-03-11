import java.util.*;
class Product{
	int code,price;
	String name;
	
	Product(String name,int code,int price)
	{
		this.name=name;
		this.code=code;
		this.price=price;
		
	}
	void display()
	{
		System.out.println("name="+name);
		System.out.println("code="+code);
		System.out.println("price="+price);
		System.out.println();
	}
}	

class Lowest{
	static void Details(Product p1,Product p2,Product p3)
	{
		if(p1.price < p2.price && p1.price < p3.price){
			System.out.println("Product " +  p1.name + " has the lowest price");
		}
		else if(p2.price < p1.price && p2.price < p3.price){
			System.out.println("Product " +  p2.name +" has the lowest price");
		}
		else{
			System.out.println("Product " +  p3.name + " has the lowest price");
		}	
	
	}
	public static  void main(String args[])
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name=sc.nextLine();
		System.out.println("Enter the code: ");
		int code=sc.nextInt();
		System.out.println("Enter the price: ");
		int price=sc.nextInt();*/
		Product p1=new Product("Rice",1211122,250);
		Product p2=new Product("Brush",121112233,25);
		Product p3=new Product("Paste",121112255,50);
		p1.display();
		p2.display();
		p3.display();
		Details(p1,p2,p3);
		
	}



}
