import java.util.*;
public class N08Prime
{
	static void prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println(n+" is prime number");
		else
			System.out.println(n+" is not prime number");
	}
			



	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number to check whether prime or not ");
		int n=sc.nextInt();

		prime(n);
	}
}