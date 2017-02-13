/*
 Write a program to reverse the given array?
 */
package reversearray;
import java.util.Scanner;


public class Reversearray {

    
    public static void main(String[] args) {
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] A = new int[n];
        System.out.println("Enter elements of array");
        for(i=0;i<n;i++)
        {
            A[i]=s.nextInt();
        
        }
        System.out.println("Entered array elements are ");
        for(i=0;i<A.length;i++)
      {
          System.out.println(A[i]);
      }
       int j = i - 1;     
       i = 0;         	   
       while(i<j)
       {
          int temp = A[i];
           A[i] = A[j];
           A[j] = temp;
           i++;
           j--;
       }
         System.out.println("Reversed array is ");    
         for(i=0;i<A.length;i++)
      {
          System.out.println(A[i]);
      }
    }
    
}
