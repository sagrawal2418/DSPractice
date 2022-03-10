package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class ComparatorDemo {

    public static void main(String[] args) {
        ArrayList<Student> al= new ArrayList<>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al,new AgeComparator());

       for(Student a:al){
           System.out.println(a.age);
       }

       Collections.sort(al,new NameComparator());
        for(Student a:al){
            System.out.println(a.name);
        }

        //comparable
        Collections.sort(al);
        for(Student a:al){
            System.out.println(a.age);
        }
    }
}
