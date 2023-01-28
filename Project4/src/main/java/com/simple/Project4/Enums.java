package com.simple.Project4;
import java.util.*;

enum City {INDORE,BHOPAL,CHENNAI};

public class Enums {
	public static void main(String[] args) {
		Set<City> set1;
		set1 = EnumSet.of(City.INDORE,City.BHOPAL);
		System.out.println(set1);
		
	}

}
