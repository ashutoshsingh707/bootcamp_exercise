package com.bootcamp.exercises.JAVA_2;
import java.util.Scanner;

public class Qwhiledowhile8_2 {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a word: ");
            String s1=sc.next();
            do{
                if(s1.charAt(0)==s1.charAt(s1.length()-1))
                {
                    System.out.println("first and last characters are equal.");
                }
                else
                {
                    System.out.println("first and last characters are not equal.");
                }
                s1=sc.next();
            }while(!s1.equals("done"));
        }
    }
