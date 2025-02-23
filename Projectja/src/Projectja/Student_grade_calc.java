package Projectja;
import java.util.Scanner;
public class Student_grade_calc {

	public static void main(String[] args) {
		int n;
		int sum=0;
		int avg=0;
		int marks = 0;
		String grade;
		System.out.println("how many no. of subject: ");
		try (Scanner sc = new Scanner(System.in)) {
			n=sc.nextInt();
			int i;
			for(i=1;i<=n;i++)
			{
				System.out.println("enter  the marks obtained in subject " +i+":");
				 marks=sc.nextInt();
				 sum=sum+marks;
			}
			sc.close();
		}
		//sum=sum+marks;
		avg=sum/n;
		if(avg<=90 && avg>=80) {
			 grade="a+";
		 }
		else if(avg<=80 && avg>=70) {
				 grade="a";
			 }
		else if(avg<=70 && avg>=60)
			 {
				grade="b";
			 }
		else if(avg<=60 && avg>=50)
			 {
				 grade="c";
			 }
		 else
			 {
				 grade="d";
			 }
		System.out.println("sum="+sum);
		System.out.println("average="+avg+"%");
		
		System.out.println("grade="+grade);
		
	}
}
	