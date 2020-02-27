package com.bootcamp.exercises.Java8Features.Q4Employee;

public class Main {

        public static void main(String[] args) {
            ConstRef constRef=Employee::new;
            Employee e1=constRef.getEmp("Ashutosh",22,"Ghaziabad");
            System.out.println(e1);
        }
    }
