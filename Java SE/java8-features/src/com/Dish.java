package com;

import java.util.Arrays;
import java.util.List;

public class Dish {
	
	private final String name;
	private final boolean vegeterian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegeterian, int calories, Type type) {
		super();
		this.name = name;
		this.vegeterian = vegeterian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegeterian() {
		return vegeterian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dish  [name= " + name + ", vegetarian= " + vegeterian + ", calaries= " + calories + ", type=" + type
				+ "]";
	}

	public static final List<Dish> menu = Arrays.asList(new Dish("season fruit", true, 120, Type.OTHER),
			new Dish("pork", false, 800, Type.MEAT), new Dish("beef", false, 700, Type.MEAT),
			new Dish("chicken", false, 400, Type.MEAT), new Dish("french fries", true, 530, Type.OTHER),
			new Dish("rice", true, 350, Type.OTHER), new Dish("panner pizza", true, 1200, Type.OTHER),
			new Dish("prawns", false, 400, Type.FISH), new Dish("fish", false, 450, Type.FISH));





}
