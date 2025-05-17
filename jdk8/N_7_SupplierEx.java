package com.leetcode.jdk8;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class N_7_SupplierEx {

	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier=()->LocalDateTime.now();
		
		LocalDateTime localDateTime = supplier.get();
	System.out.println(localDateTime);
	}
}
