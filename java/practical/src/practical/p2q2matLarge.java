package practical;

import java.util.Scanner;

public class p2q2matLarge {

static int[][] mat=new int[5][5];
public static void main(String[] args)
{
System.out.println("Enter Matrix:");
takemat();
System.out.println(largeNum(mat));
}
public static void takemat() {
	Scanner sc =new Scanner(System.in);
	for	(int i=0;i<5;i++)
		for(int j=0;j<5;j++)
			mat[i][j]=sc.nextInt();
}
public static int largeNum(int[][] a)
{
	int l=0;
	for	(int i=0;i<5;i++)
		for(int j=0;j<5;j++)
			if(a[i][j]>l)l=a[i][j];
return l;	
}
}

