import java.util.*;
class check_arm
{
	public static void main(String[]ah)
	{
		
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter the number that you want to check ");
		int n=ob.nextInt();
		
	 	int a=n;
		int sum=0,rem;
		while(a>0)
		{
			rem=a%10;
			sum=rem*rem*rem+sum;
			a=a/10;
		}

		if(sum==n)
		System.out.println("Number is arm ");
	}

}