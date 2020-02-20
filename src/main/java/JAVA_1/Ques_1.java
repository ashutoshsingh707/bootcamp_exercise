package JAVA1.src.main.java;

import java.util.*;
public class Ques_1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String a=scan.nextLine();
        System.out.println("Enter string to be replaced");

        String b=scan.next();

        System.out.println("Enter string that replaces");
        String c=scan.next();

        System.out.println(a.replace(b,c));
    }
}