package com.bootcamp.exercises.CollectionExercises.Q6Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> Std = new ArrayList<Student>();

        Std.add(new Student("Ashutosh",65,19));
        Std.add(new Student("Suraj",75,18));
        Std.add(new Student("Singh",75,19));
        Std.add(new Student("Sunny",70,19));
        Std.add(new Student("Robert",85,18));

        Collections.sort(Std, new SortByScore());

        Iterator itr = Std.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
