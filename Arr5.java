/*
 Given an array A[], write a program to check whether 
the element "x" present in the array or not?
 */
package arr5;

import java.util.Scanner;
public class Arr5 {

    
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
         System.out.println("Enter element to search in array");
        int x = s.nextInt();
         for(i=0;i<n;i++)
         {
        
        if (x==A[i])
        {
         System.out.println("element is in array  " +(i+1));
         break;
         }
         }
        if(i==n)
        {
         System.out.println("element is not in array");   
        }
        }
    }