package com.novoda.sqliteprovider.demo.domain;

public class Firework {

	public final String name;
	public final String color;
	public final String type;
	public final String noise;
	
	public Firework(String name, String color, String type, String noise) {
		this.name = name;
		this.color = color;
		this.type = type;
		this.noise = noise;
	}
	
	@Override
	public String toString() {
		return name;
	}
}