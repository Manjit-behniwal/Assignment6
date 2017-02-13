/*
 WAP to find third smallest element in array*/

package thir;
import java.util.Scanner;

public class Thir {
    public static void main(String[] args) {
       int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        
        }
        System.out.println("Entered array elements are ");
        for(i=0;i<a.length;i++)
      {
          System.out.println(a[i]);
      }
        System.out.println("Third smallest element in array is ");
      System.out.println(findthirdSmallest(a,3,0));
    }

    static int findthirdSmallest(int [] array, int n, int last) {
      if (n == 0)
        return last;
      int MAX = 9999;
      int pos = 0;
      int curMin = 0;
      boolean changed = false;
      for (int i = 0; i < array.length; i++)
      {
        if (changed == false && array[i] > last)
         {
          curMin = array[i];
          changed = true;
         }
        if (array[i] < curMin)
        {
          pos = i;
          curMin = array[i];
        }
      }
      array[pos] = MAX;
      return findthirdSmallest(array, n-1, curMin);
    }
}
