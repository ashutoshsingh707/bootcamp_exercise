import java.util.*;
public class Ques_3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String a=scan.nextLine();
        System.out.println("Enter string to be replaced");
        String b=scan.nextLine();
        int count=a.length() - a.replace(b,"").length();
        System.out.println("Number of occurances of substring in "+a+"= "+count);
    }
}
