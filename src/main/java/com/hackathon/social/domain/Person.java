package com.hackathon.social.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
	private long id;
	private String name;
	private String address;

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
}
