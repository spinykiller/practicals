

import java.util.Scanner;
public class rev {
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		int num,rev=0,n,a;
		System.out.println("Enter A Number");
		num=sc.nextInt();
		n=num;
		while(n!=0)
		{
			a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		System.out.println("Reverse = "+rev);
	}
	

}