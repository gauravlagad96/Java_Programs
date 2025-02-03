package com.test.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Program3_2 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.add(3);
		list.add(70);
		list.add(7);
		list.add(90);
		list.add(10);

		Stream<Integer> stream = list.stream();
		Stream<Integer> eveNo = stream.filter(n -> n % 2 == 0);
		List<Integer> filterEveno = eveNo.toList();
		System.out.println(filterEveno);

	}

}
