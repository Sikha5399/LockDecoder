import java.io.*;
import java.util.*;
import java.lang.*;
public class Lock_Decode {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int rem;
		int esum=0;
		int osum=0;
		int sum=0;
		int p=count(num);
		while(num>0)
		{
			rem=num%10;
			sum=(int)(sum+Math.pow(rem,p));
			num=num/10;
		}
		// Check for Amstrong number
		if(temp==sum)
		{
			System.out.println("Amstrong numner");
			while(sum>0)
			{
				rem=sum%10;
				if(rem%2==0)
				{
					esum+=rem;
				}
				sum=sum/10;
			}
			System.out.println("Sum of even digits = "+esum);
		}
		else
		{
			System.out.println("Not Amstrong number");
			while(temp>0)
			{
				rem=temp%10;
				if(rem%2!=0)
				{
					osum+=rem;
				}
				temp=temp/10;
			}
			System.out.println("Sum of odd digits = "+osum);
		}

	}
	// Counting the number of digits
	static int count(int n)
	{
		int c=0;
		while(n>0)
		{
			c++;
			n=n/10;
		}
		return c;
	}

}
