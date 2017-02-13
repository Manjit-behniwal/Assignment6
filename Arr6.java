/*
 Given an array A[], write a program to sort the array?
 */
package arr6;

import java.util.Scanner;
public class Arr6 {

    
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
        for (i = 0; i < n; i++) 

        {

            for (int j = i + 1; j < n; j++) 

            {

                if (A[i] > A[j]) 

                {

                    int temp = A[i];

                    A[i] = A[j];

                    A[j] = temp;

                }

            }

        }

        System.out.print("Array in Ascending Order is :");

        for (i = 0; i < n; i++) 

        {

            System.out.print(A[i] + ",");

        }

        }
    }