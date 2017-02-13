/*
 4. Given an array A[], write a program to print the numbers 
which are occuring odd number of times?
(This program is working for only one number that occuring odd number of times)
 */
package oddnumber;

import java.util.Scanner;

public class Oddnumber {

   int getOddOccurrence(int A[], int A_size) 
    {
        int j;
        int res = 0;
        for (j = 0; j < A_size; j++) 
        {
            res = res ^ A[j];
        }
        return res;
    }
 
    public static void main(String[] args) 
    {
        Oddnumber occur = new Oddnumber();
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
        int m = A.length;
        System.out.println(occur.getOddOccurrence(A, m));
    }
}
