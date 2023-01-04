package com.software;
import java.util.*;

public class ArrayListExample {
	public static void main(String[] args)
	{
		List<String>a1=new ArrayList<>();
		a1.add("Mumbai");
		a1.add("Chennai");
		a1.add("Banglore");
		a1.add("Hyderabad");
		a1.add("Kolkata");
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		List<String>a2=new ArrayList<>();
		a2.add("Maharastra");
		a2.add("Tamil Nadu");
		a2.add("Karanataka");
		a2.add("Telungana");
		a2.add("West Bengal");
		System.out.println(a2);
		a1.addAll(a2);
		System.out.println(a1);
		a1.removeAll(a2);
		System.out.println(a1);
		System.out.println("ArrayList:"+a1.size());
		System.out.println("Array containing an element:"+a1.contains("Mumbai"));
		
		
	}

}
