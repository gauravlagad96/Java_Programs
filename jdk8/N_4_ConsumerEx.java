package com.jdk8;

import java.util.function.Consumer;

public class N_4_ConsumerEx {
	public static void main(String[] args) {
		
		Consumer<String> consumer=e->System.out.println(e);
	
		consumer.accept("hello consumer");
		
		
	}

}
