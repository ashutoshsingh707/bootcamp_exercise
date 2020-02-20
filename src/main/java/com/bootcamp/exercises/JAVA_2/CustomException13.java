package com.bootcamp.exercises.JAVA_2;

class MyException extends Exception
{
MyException(String s)
    {
        super(s);
    }
}
public class CustomException13 {
    public static void main(String args[]) {
        try {
            throw new MyException("ITS MY EXCEPTION");
        } catch (MyException ex) {
            System.out.println("GOT EXCEPTION");
            System.out.println(ex.getMessage());
        }
    }
}
