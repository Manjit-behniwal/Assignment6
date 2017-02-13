/*
 WAP to find the largest and smallest element in an array
 */
package arr4;

import java.util.Scanner;
public class Arr4 {

    
    public static void main(String[] args) {
        int m;
        Scanner s = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = s.nextInt();
        int[] arr4 = new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr4[i]=s.nextInt();
        
        }
        m=arr4[0];
         for(int i=0;i<n;i++)
         {
        
        if (m<arr4[i])
        {
         m = arr4[i];   
        }
        
            }
         System.out.println("Largest  element of array" +m);

        for(int i=0;i<n;i++)
         {
        
        if (m>arr4[i])
        {
         m = arr4[i];   
        }
        
            }
         System.out.println("smallest  element of array" +m);
    }
    
}
