package com.test.eight;

import java.util.*;

class Country {
	String playerTeamId;
	int id;
	String name;
	int run;

	public Country(String playerTeamId, int id, String name, int run) {
		super();
		this.playerTeamId = playerTeamId;
		this.id = id;
		this.name = name;
		this.run = run;
	}

	@Override
	public String toString() {
		return "[" + playerTeamId + "           " + id + "    " + name + "      " + run + "]";
	}

}

public class Program2_1 {
	public static void main(String[] args) {

		LinkedHashMap<String, Country> countryMap = new LinkedHashMap<>();

		countryMap.put("India", new Country("I001", 1, "gaurav", 100));
		countryMap.put("India", new Country("I002", 1, "shyam", 130));

		countryMap.put("Australia", new Country("A001", 2, "vaibhav", 150));
		countryMap.put("England", new Country("E001", 3, "yahraj", 120));

		for (Map.Entry<String, Country> entry : countryMap.entrySet()) {
			System.out.print(entry.getKey() + "\n");
			System.out.println("PlayerTeamId    Id     Name     Run");
			System.out.println(entry.getValue());
			System.out.println("-----------------------------------------");
		}

	}
}
