import java.util.Scanner;
import java.util.Random;

class Number_Game
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int a = rand.nextInt(100);
		int p =0 ;
		System.out.println("WELCOME GUYS IN MY FURSAT GAME STUDIO.....  \nNumber Guessing Game.....\n");
		do{
		    int attempt = 1, n=0;
	    	while(n != a){
	    		System.out.print("Guess the number between 1 to 100 : ");
	    		n = sc.nextInt();
	    		if(n>=1 && n<=100)
				{
					if(n == a)
					{
	    			System.out.println("Congrats, You guess the right number : "+n+" in attempt : "+attempt);
	    			System.out.println("\nIf you want to play again type 1.");
	    			p = sc.nextInt();
					}
					else if(n>a){
	    			System.out.println("Your guessing number is high.\n");
	    			attempt++;
					}
					else{
	    			System.out.println("Your guessing number is low.\n");
	    			attempt++;
					}
				}
				else {
				    System.out.println("You should enter the number between 1 to 100.\nPlease try again.\n");
				}
	    	}
		}while(p==1);
	}
}