package Projectja;
import java.util.*;
class BankAccount
{
	double balance;
	public BankAccount(double id)
	{
		balance=id;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public boolean withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance-=amount;
			return true;
		
		}
		else
		{
			System.out.println("\n insufficient fund withdraw failed");
			return false;
		}
		
	}
	
}
class Atm
{
	private BankAccount Account;
	public Atm(BankAccount Account)
	{
		this.Account=Account;
	}
	public void DisplayMenu()
	{
	System.out.println("welcome to the atm");	
	System.out.println("press 1 for check balance");
	System.out.println("press 2 for deposit");
	System.out.println("press 3 for Withdraw");
	System.out.println("press 4 for exit");
	}
	public void Pt()
	{
		Scanner sc=new Scanner(System.in);
		
	int ch;
	double amount;
	
	 while(true)
	 {
		 DisplayMenu();
		 System.out.println("Enter a choice");
		 ch=sc.nextInt();
	 
	 switch(ch)
	 {
	 case 1:
		 System.out.println("your balance is : rs"+Account.getBalance());
		 break;
	 case 2:
		 System.out.println("enter deposit amount: rs");
		 amount=sc.nextDouble();
		if(amount>0)
		{
			Account.deposit(amount);
			System.out.println("deposited Successfully");
		}
		else
			System.out.println("invalid deposit amount");
		break;
	 case 3:
		 System.out.println("enter the withdra amount:rs");
		 amount=sc.nextDouble();
		 if(amount>0 && Account.withdraw(amount))
		 {
			 System.out.println("withdraw success");
		 }
		 else
			 System.out.println("invalid withdraw");
		 break;
	 case 4:
		 System.out.println("thank you for using the ATM good bye");
		 break;
	default:
		System.out.println("invalid choice");
	 }
	 }
	}
}
public class Atm_Interface {

	public static void main(String[] args) {
		
		BankAccount userAccount=new BankAccount(1000);
		Atm  atm= new Atm(userAccount);
		atm.Pt();
	}

}
