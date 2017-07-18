package practicles;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P1q1 {
private static Scanner sc;

public static void main(String args[])throws Exception{
daysOfYear d= new daysOfYear();
sc = new Scanner(System.in);
System.out.println("Enter Year:");
try{
	d.setyear(sc.nextInt());
}	
catch(InputMismatchException e)
{
System.out.println("Wrong format!!try again");
d.setyear(sc.nextInt());
}
System.out.println("Enter Month:");
try{
	d.setmonth(sc.nextInt());
}	
catch(InputMismatchException e)
{
System.out.println("Wrong format!!try again");
d.setmonth(sc.nextInt());
}
System.out.println("Number of days are:"+d.getDays());
}
}
