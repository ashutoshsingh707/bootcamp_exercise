package com.bootcamp.exercises.CollectionExercises.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> Emp = new ArrayList<Employee>();

        Emp.add(new Employee(25,10000,"Ashutosh"));
        Emp.add(new Employee(26,11000,"Suraj"));
        Emp.add(new Employee(27,9000,"John"));
        Emp.add(new Employee(28,12000,"Sunny"));
        Emp.add(new Employee(29,8000,"Singh"));

        Collections.sort(Emp, new SortBySalary());

        Iterator itr = Emp.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}