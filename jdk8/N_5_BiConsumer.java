package com.jdk8;

import java.util.function.BiConsumer;

public class N_5_BiConsumer {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer=(x,y)->{
			System.out.println(x*y);
		};
		
		biConsumer.accept(8, 7);
	}
	
	

}
