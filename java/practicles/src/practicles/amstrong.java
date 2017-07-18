package practicles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class amstrong {
int num;
public void setNum(){
	Scanner sc=new Scanner(System.in);
	try{
		num=sc.nextInt();
	}
	catch(InputMismatchException e){
		System.out.println("Wrong input");
	}
}
public boolean check()
{
	int sum=0,digit=0;
	for(int j=num;j>0;j/=10)
	{
		digit=j%10;
		sum+=(digit*digit*digit);
	}
	return (sum==num)?true:false;
}

}
