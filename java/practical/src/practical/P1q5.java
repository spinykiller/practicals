package practicles;

public class P1q5 {
public static void main(String[] args)
{
	amstrong check=new amstrong();
	check.setNum();
	System.out.println("Enter number to check:");
	System.out.println((check.check())?"Amstrong Number":"not a amstrong");
	}
}
