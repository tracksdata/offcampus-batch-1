package com;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

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
		
		// sum of all veg items menu - v1
		//Double sum=menu.stream()
		//.filter(itemObj->itemObj.isVeg())
		//.mapToDouble(priceObj->priceObj.getPrice()).sum();
		
		// sum v2
		//double sum=menu.stream()
	   //.filter(itemObj->itemObj.isVeg())
	   //.collect(Collectors.summingDouble(priceObj->priceObj.getPrice()));
		//System.out.println("Sum: "+sum);
		
		// map
		
		menu.stream()
		.map(item->item.getItemName())
		//.toUpperCase())
		.parallel()
		.forEach(str->{
			System.out.println(str);
		});
		
		
		
		
		

	}

}
