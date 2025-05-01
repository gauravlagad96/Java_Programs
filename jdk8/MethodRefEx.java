package com.jdk8;

import java.rmi.StubNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class MobilePhone{
	String name;
	
	public MobilePhone(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "MobilePhone [name=" + name + "]";
	}
	
}

public class MethodRefEx {
	public static void main(String[] args) {

		//method reference
		List<String> students = Arrays.asList("gaurav", "vaibhav", "RAm");
		// students.forEach(x -> System.out.println(x));
		students.forEach(System.out::println);
		
		System.out.println("---------------------");
		//constructor reference
		List<String>names=Arrays.asList("A","B","c");
		
		/* List<MobilePhone> mobiles=names.stream()
				.map(x-> new MobilePhone(x))
				.collect(Collectors.toList()); */
		
		List<MobilePhone> mobiles=names.stream()
				.map(MobilePhone::new)
				.collect(Collectors.toList());
		
		for(MobilePhone mobile:mobiles) {
			System.out.print(mobile + " ");
		}
		
		System.out.println("\n------------------------");
		
	}
	
}

