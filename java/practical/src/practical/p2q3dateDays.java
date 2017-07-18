package practical;

import java.time.LocalDateTime;
import java.util.Scanner;

public class p2q3dateDays {
public static void main(String[] args) {
	LocalDateTime now = LocalDateTime.now();
	System.out.println("Today is "+now +"and day is "+now.getDayOfWeek()+"\n Enter days to add in number:");
	Scanner sc=new Scanner(System.in);
	now=now.plusDays(sc.nextLong());
	System.out.println("date is "+now +"and day is "+now.getDayOfWeek());
}
}
