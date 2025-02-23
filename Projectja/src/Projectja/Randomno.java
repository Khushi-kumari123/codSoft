package Projectja;
import java.util.Random;
import java.util.Scanner;
public class Randomno {

	public static void main(String[] args) {
		Random rand=new Random();
		int guess;
		System.out.println("enter a guess number");
		Scanner sc= new Scanner(System.in);
		guess =sc.nextInt();
		sc.close();
		int number=rand.nextInt(100);
		System.out.println("generated no is:"+number);
		
		if(number==guess)
		{
			System.out.println(" guess is correct");	
		}
		else if(number>guess)
		{
			System.out.println("guess no is low");
		}
		else
			System.out.println("guess no is high");
	}

}
