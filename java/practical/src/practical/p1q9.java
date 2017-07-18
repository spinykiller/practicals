package lab1;
import java.util.*;
public class Q19 
{
	public static void main(String[] args) 
	{
		int radius;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of sphere");
		radius=s.nextInt();
		double volume;
		volume=(4/3)*3.14*(radius)*(radius)*(radius);
		System.out.println("Volume of Sphere"+volume);
	}

}
