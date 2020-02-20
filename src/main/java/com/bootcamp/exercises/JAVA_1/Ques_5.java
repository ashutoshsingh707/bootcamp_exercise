import java.util.Arrays;
import java.util.Scanner;

public class Ques_5 {
public static void main(String[] args) 
    {
        System.out.println("Enter length of array");
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
      int[] array1 =  new int[n];
      int[] array2 =  new int[n];
        System.out.println("Enter array1");
        for(int i=0;i<n; i++){
            array1[i] = scan.nextInt();
        }
        System.out.println("Enter array2");
        for(int i=0;i<n; i++){
            array2[i] = scan.nextInt();
        }
 
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
      
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                 }
            }
        }
 
    }
}

