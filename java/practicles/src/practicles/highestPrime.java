package practicles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class highestPrime {
	int n1,n2;
	public void setNum()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter range :");
	try{
	n1=sc.nextInt();
	n2=sc.nextInt();
	}
	catch(InputMismatchException e)
	{
		System.out.println("Enter right data!!");
		setNum();
	}
	if(n1>n2){
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
	}
	}
	boolean isprime(int i){
		for(int j=i-1;j>1;j--)
		{
			if(i%j==0)
			return false;
			}
		return true;
	}
	public String find()
	{
		for(;n2>n1;n2--)
		{
			if(isprime(n2))return "Highest Prime number is "+n2;
		}
		return "No prime number";
	}
}
