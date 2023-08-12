import java.util.Scanner;

class Atm_Body
{
	Scanner sc= new Scanner(System.in);
	double balance = 500.0;
	public void checkBalance()
	{
		System.out.println("Your Current Avl Balance is Rs:"+balance+" -FURSAT BANK OF INDIA.\n");
	}
	public void withdraw(double amount)
	{
		if(balance >= amount)
		{
		    balance = balance - amount;
		    System.out.println("Your amount Debited for Rs:"+amount+" and Avl Balance Rs:"+balance+" -FURSAT BANK OF INDIA.\n");
		}
		else
		{
		    System.out.println("Your balance is not Sufficient. Avl Balance Rs:"+balance+" -FURSAT BANK OF INDIA.\n");
		}
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Your amount Credited for Rs:"+amount+" and Avl Balance is Rs:"+balance+" -FURSAT BANK OF INDIA.\n");
	}
}

class Atm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Atm_Body obj = new Atm_Body();
		int choice;
		System.out.println("WELCOME TO MY FURSAT ATM.....");
		do{
			System.out.println("Press the option according to your need.....\n\n1 for Checking Balance.\n2 for Withdrawing the amount.\n3 for Deposite the amount.\n4 for exit.");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1 : obj.checkBalance();
			         break;
			case 2 : System.out.println("Please enter the amount.");
			         double a = sc.nextDouble();
			         obj.withdraw(a);
			         break;
			case 3 : System.out.println("Please enter the amount.");
			         double b = sc.nextDouble();
			         obj.deposit(b);
			         break;
			case 4 : System.out.println("Thank you for visit my Fursat Atm. -FURSAT BANK OF INDIA.\n");
			         System.exit(0);
			         break;
			default : System.out.println("You choose the wrong option.\nPlease try again. -FURSAT BANK OF INDIA.\n"); 
			         System.exit(0);
			}
 		}while(choice<=4);
	}
}