package practicles;

import java.util.Scanner;

public class P1q4 {
public static void main(String[] ars){
	//draw shape if hollow triangle
	System.out.println("Enter the length");
	Scanner sc =new Scanner(System.in);
	int height=sc.nextInt();
	int base=height*2;
	int curRow=0;
	int curCol=0;
	while(curRow<height)
	{
		while(curCol<base)
		{	
			if(curCol==(height-curRow)||curCol==(height+curRow) || curRow==height-1)
			{
			System.out.print("*");
			}
			else{
				System.out.print(" ");		
			}
			curCol++;
		}
		System.out.println("");
		curRow++;
		curCol=0;
	}
/*	System.out.print(" ");
	while(curCol<base-1)
	{
		System.out.print("*");
		curCol++;
	}*/
}
}
