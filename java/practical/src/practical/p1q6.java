package lab1;
import java.util.*;
import java.io.*;
public class Q16 
{
		 int a=0,b=1,c=0;    
		 public void printFibonacci(int count)
		 {    
			 System.out.println(a);
		    	System.out.println(b);
			 while(count>0)
		    {   
		        c=a+b;    
		        a=b;    
		        b=c;    
		        System.out.println(c);   
		        count--;    
		     }    
		 }    
		 public static void main(String args[])
		 {    
			 Q16 obj = new Q16();
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter No of fibonacci Series to print");
			 int count=sc.nextInt();        
			 obj.printFibonacci(count);  


	}

}
