import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String a="ashutoh";
        int count=0;
        for(int i=0;i<=6;i++){
            char z=a.charAt(i);
            count=0;
            for(int j=i;j<=6;j++){
                if(a.charAt(j)==z){
                    count+=1;
                }
            }
            if(count>1){
                System.out.println("count of "+a.charAt(i)+"="+count);
            }
        }
    }
}

