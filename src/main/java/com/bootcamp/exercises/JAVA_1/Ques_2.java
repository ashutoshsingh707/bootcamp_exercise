import java.util.*;
public class Ques_2
    {
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a String");
            String a= scan.nextLine();
            int count=0;
            for(int i=0;i<a.length();i++){
                char z=a.charAt(i);
                count=0;
                for(int j=i;j<a.length();j++){
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

