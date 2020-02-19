import java.util.Arrays; 
public class Solution {
public static void main(String[] args) 
    {
      int[] a = {1,1,2,2,3,3,4,4,5};
      int count=0;
        for (int i = 0; i < 9; i++)
        {
            count=0;
            for (int j = 0; j < 9; j++)
            {
                if(a[i] == a[j])
                {
                 count+=1;
                }
            }
        if(count==1){
            System.out.println("unique element = "+a[i]);
        }
        }
 
    }
}

