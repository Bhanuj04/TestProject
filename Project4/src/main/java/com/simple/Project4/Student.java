package com.simple.Project4;
import java.util.*;
public class Student implements Comparable<Student> {
	String name;
    int rollNo;
	public int age;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +  "name='" + name + '\'' + ", rollNo=" + rollNo + '}';
    }
    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }
	
	
	
	
	

}
