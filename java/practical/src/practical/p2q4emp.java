package practical;

import java.util.Scanner;

public class p2q4emp {
public static void main(String[] args) {
	int salary=0;
	Scanner sc=new Scanner(System.in);
	String name="";
	System.out.println("Are u visiting(0) or permanant(1)");
	int type=sc.nextInt();
	name=sc.nextLine();
	System.out.println("Name:");
	name=sc.nextLine();	
	System.out.println("Designation:\n 1.pricess 2.hog rigder 3.gaint");
	int desig=sc.nextInt();	
	String design="";
	switch(desig)
	{
	case 1:
		salary=(type==1)?15000:20000;
		design="princess";
		break;
	case 2:
		salary=(type==1)?15000:20000;
		design="hog rider";
		break;
	case 3:
		salary=(type==1)?15000:20000;
		design="gaint";
		break;
	default:
		System.out.println("wrong details");
			break;
	}
	System.out.println("Entered datails are :\n Type:"+((type==0)?"Visiting":"Permanent")+"\n Name:"+name+"\n Designation :"+design+"\n Salary:"+salary);
	
} 
}
