package com.simple.Project4;
import java.util.*;

public class Stu2 {

	public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Znuj", 2));
        list.add(new Student("Ramesh", 4));
        list.add(new Student("Shivam", 3));
        list.add(new Student("Rohit", 1));

        Student s1 = new Student("Znuj", 4);
        Student s2 = new Student("Rohit", 3);

   System.out.println((s1.compareTo(s2)));
   
 

  
}


}
