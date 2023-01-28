package com.simple.Project4;
import java.util.Date;

public class StackHeap {
	public static void main(String[] args) {
		int x=10;
        int y=20;
        String greet = "Hello";
        Date d = new Date();
        diff(x, y);
	}
	public static int diff(int x1, int x2) {
        return x2-x1;
    }

}

