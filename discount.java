import java.util.Scanner;

class test
{
	double price;
	String name;
	double c;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name and price of product");
		name=sc.nextLine();
		price=sc.nextDouble();
	}
	void calc()
	{
		if(price<=10000)
			c=(5.0/100)*price;
		else if(price>10000 && price<=15000)
			c=(10.0/100)*price;
		else
			c=(15.0/100)*price;
	}
	void display()
	{
		System.out.println("Name = "+ name);
		System.out.println("Discount = "+ c);
	}
}
class discount
{
	public static void main(String[] args)
	{
		test obj=new test();
		obj.getdata();
		obj.calc();
		obj.display();
	}
}

