package lab1;
import java.util.*;
public class Q17 
{
	public int power(int x,int y)
	{
		if (y>0)
	    {
	        return (x * power(x,y - 1));
	    }
	    return 1;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int x,y,result;
		System.out.println("Enter the base");
		x=s.nextInt();
		System.out.println("Enter the power");
		y=s.nextInt();
		Q17 obj = new Q17();
		result=obj.power(x,y);
		System.out.println("The power of a no is "+result);
	}

}
