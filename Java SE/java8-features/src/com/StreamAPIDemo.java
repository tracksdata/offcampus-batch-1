package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		
		Item i1=new Item(10,"Idle",76,true);
		Item i2=new Item(11,"Vada",43,true);
		Item i3=new Item(12,"Egg",34,false);
		Item i4=new Item(13,"Poori",54,true);
		Item i5=new Item(14,"Chicken Biryani",450,false);
		Item i6=new Item(15,"Fish",345,false);
		Item i7=new Item(16,"Veg Biryani",276,true);
		Item i8=new Item(17,"Chilli Chicken",332,false);
		Item i9=new Item(18,"Mutton Biryani",454,false);
		Item i10=new Item(19,"Pongal",123,true);
		
	
		List<Item> menu=Arrays.asList(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10);
		
		//Stream<Item> menuV1=Arrays.asList(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10).stream();
		
		// stream
		//Stream<Item> stream = menu.stream();
		// list all menu.
		
		/*
		menu.forEach(item->{
			System.out.println(item);
		});
		*/
		
		System.out.println("--------------------");
		
		menu.stream().forEach(item->{
			System.out.println(item);
		});
		
		System.out.println("--------------------");

	
		
		     /*
		        menu.stream()
				.filter(item->item.isVeg())
				.limit(2)
				.forEach(item->{
					System.out.println(item);
				});
				
				*/
		
		    double vegItemsTotal = menu.stream()
			.filter(item->item.isVeg())
			.mapToDouble(itemCost->itemCost.getPrice())
			.sum();
		    System.out.println("Veg: Total:: "+vegItemsTotal);
			
		
		
		
		
	   List<Item> nonVegMenu = menu.stream()
				.filter(item->!item.isVeg())
				.limit(4)
				.collect(Collectors.toList());
		
		
		

		//vegMenu.forEach(vegItem->{
		//	System.out.println(vegItem);
		//});
		
		System.out.println("-------------------------");
		
		nonVegMenu.forEach(itemMenu->{
			System.out.println(itemMenu);
		});
		
		Item myItem=menu.stream()
				.filter(item->item.getItemId()==103)
				.findFirst()
				.orElse(null);
		
		System.out.println("-----------------");
		System.out.println(myItem);
		
		

	

	
		
		
		
		
		
		

	}

}
