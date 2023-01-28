package com.simple.Project4;
import java.util.*;


public class ArrayClass {
	 
	public static void main(String[] args) {

   int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
  int index = Arrays.binarySearch(numbers, 4);    //to find element works only for sorted
 
  System.out.println("index of element 4  " + index);

      Integer[] numberss = { 10, 2, 32, 12,  9 };
      Arrays.sort(numberss);    //sort elements



      Arrays.fill(numberss, 12);   //fill all index with 12

      for (int i : numberss) {
          System.out.print(i + " ");
      }



  }

}
