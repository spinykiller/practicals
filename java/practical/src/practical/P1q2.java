package practicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1q2 {
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
binaryOrNot b=new binaryOrNot();
System.out.println("Enter Data:");
b.setNum(br.readLine());
System.out.println((b.check()?"binary":"not binary"));
}
}
