

import java.util.Scanner;



public class CalcUser {

	public static void main(String[] args) 
	{
		int num1,num2;
		char operator;
		Scanner sc=new Scanner(System.in);
		
		do
		{
		System.out.println("enter num1");
		num1=sc.nextInt();
		System.out.println("enter num2");
		num2=sc.nextInt();
		System.out.println("enter operator: press:+ , - , * , / | press: any other to exit");
		operator=sc.next().charAt(0);
		
		int result=Calculator.calculate(num1,num2,operator);
		if(result==-1)
		{
			System.out.println("invalid operator");
		}
		else {
			System.out.println("result: "+result);
		}
		
		System.out.println("press 0 to exit OR press 1 to continue");
		int exit=sc.nextInt();
		if(exit==0)
			break;
		if(exit==1)
			continue;
		
		}while(true);
		
		
		sc.close();
	}

}
