package lab1;
import java.util.Scanner;  
    public class Q18 
{  
        public static void main (String[] args)  
    {  
            System.out.println("Enter the Size of a triangle, an integer from 1 to 50 please.");  
            Scanner scan = new Scanner(System.in);  
            int min, max;  
            int tot = scan.nextInt();  
            for(min = 0; min <= tot; min++) 
          {  
                for(max = 0; max < min; max++) 
               {  
                    System.out.print("*");  
                }  
                System.out.println();  
            }  
            for(min = tot-1; min >= 0; min--) 
           {  
                for(max = min-1; max >= 0; max--) 
               {  
                    System.out.print("*");  
                }  
                System.out.println();  
            }  
      
        }  
      
} 
