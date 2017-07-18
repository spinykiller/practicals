package practical;

import java.util.Arrays;
import java.util.Scanner;

public class p2q5sortSearch {
public static void disp(int[] a)
{
for(int i=0;i <a.length;i++)
	System.out.println(a[i]);
}

	public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int[] a=new int[5];
	System.out.println("Enter array:");
	for(int i=0;i<5;i++)	
	{
	a[i]=sc.nextInt();
	}
Arrays.sort(a);
disp(a);
System.out.println("Enter search element:");
int key=sc.nextInt();
System.out.println("Value found at :"+Arrays.binarySearch(a, key));
}
}
