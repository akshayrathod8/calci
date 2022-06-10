

public class Calculator {
	
	public static int calculate(int num1,int num2,char operator)
	{
		int ans;
		switch(operator)
		{
		case '+':
			ans=num1+num2;
			return ans;
			
		case '-':
			ans=num2-num1;
			return ans;
		case '*':
			ans=num1*num2;
			return ans;
		case '/':
			ans=num2/num1;
			return ans;
		default:
			return -1;
				
		}
	}

}
