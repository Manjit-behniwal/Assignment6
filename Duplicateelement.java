/*
 Wap to find duplicate element in Integer array*/
package duplicateelement;
 
import java.util.HashSet;
import java.util.Set;
 
public class Duplicateelement
{
    public static void main(String[] args) 
    {
        int[] array = {1,1,2,3,3,4,5,6,7,8,8,99,99};
         
        Set<Integer> set = new HashSet<Integer>();
         
        for(int i = 0; i < array.length ; i++) 
        {
            if(set.add(array[i]) == false) 
            {
                System.out.println("Duplicate element found : " + array[i]);
            }
        }
    }
}
