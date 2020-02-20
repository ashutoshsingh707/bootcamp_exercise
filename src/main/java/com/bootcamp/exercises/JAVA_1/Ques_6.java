import java.util.Arrays;
import java.util.Scanner;

public class Ques_6 {
public static void main(String[] args) 
    {
        System.out.println("Enter length of array");
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int[] a =  new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n; i++){
            a[i] = scan.nextInt();
        }
        int count=0;
        for (int i = 0; i < a.length; i++)
        {
            count=0;
            for (int j = 0; j < a.length; j++)
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

