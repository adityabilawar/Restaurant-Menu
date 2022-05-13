package RestaurantMenu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RestaurantMenu {
	Map<String, ArrayList<String>> menu;
	public RestaurantMenu(){
		menu = new TreeMap<String, ArrayList<String>>();
	}
	public void add(String sent) {
		int firstSpace = sent.indexOf(" ");
		String FoodCategory = sent.substring(0, firstSpace);
		String MenuItem = sent.substring(firstSpace);
		
		ArrayList<String> MenuItems = new ArrayList<String>();
		if(menu.containsKey(FoodCategory)) {
			MenuItems = menu.get(FoodCategory);
			MenuItems.add(MenuItem);
			menu.put(FoodCategory, MenuItems);
		}
		else {
		    MenuItems.add(MenuItem);
			menu.put(FoodCategory, MenuItems);
		}
	}
	
	public Set<String> twoItems(){
		Set<String> two = new HashSet<String>();
		for(String a : menu.keySet()) {
			for(int i = 0; i < menu.get(a).size(); i++) {
				if(menu.get(a).get(i).split(" ").length == 3) {
					two.add(menu.get(a).get(i));
				}
			}
		}
		return two;
	}
	public Set<String> cheese(){
		Set<String> cheese = new HashSet<String>();
		for(String a : menu.keySet()) {
			for(int i = 0; i < menu.get(a).size(); i++) {
				if(menu.get(a).get(i).contains("Cheese") || menu.get(a).get(i).contains("cheese")) {
					cheese.add(menu.get(a).get(i));
				}
			}
		}
		return cheese;
	}
	public String toString() {
		return menu.toString();
	}
	
}
