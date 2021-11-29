package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.Dish.Type;
//import static java.util.Comparator.comparing;

/*
class SortTest implements Comparator<Dish>{
	@Override
	public int compare(Dish o1, Dish o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
*/
public class StreamDemoV1 {

	public static void main(String[] args) {
		
		List<Dish> menu = Dish.menu;
		
		
		//System.out.println(menu);
		
		
		/*
		List<Dish> lowCals=new ArrayList<Dish>();
		for(Dish d:menu) {
			if(d.getCalories()<=400) {
				lowCals.add(d);
			}
		}
	
		
		
		
		Collections.sort(lowCals,new SortTest());
		
		lowCals.forEach(System.out::println);
		
		System.out.println("------------------");
		*/
		
		
		// get entire object
		List<Dish> lowCalMenu = menu.stream()
		.filter(itemObj->itemObj.getCalories()<=400)
		.sorted(Comparator.comparing(Dish::getName))
		.collect(Collectors.toList());
		
		lowCalMenu.forEach(System.out::println);
		
		// get/return only dish name which is less than 400 calaries
	
		List<String> lowCalsDishNames = menu.stream()
		.filter(dishObj->dishObj.getCalories()<=400)
		.sorted(Comparator.comparing(Dish::getName))
		.parallel()
		.map(Dish::getName)
		.collect(Collectors.toList());
		
		System.out.println("-----------------------");
		lowCalsDishNames.forEach(System.out::println);
		
		

	}

}
