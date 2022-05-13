package RestaurantMenu;
import java.io.*;
public class RestaurantMenuTester {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader(new File("H:\\workspace2021\\Maps\\src\\RestaurantMenu\\CountryPlaceMenu.dat"));
		BufferedReader br = new BufferedReader(file);
		RestaurantMenu one = new RestaurantMenu();
		while(br.ready()) {
			one.add(br.readLine());
		}
		System.out.println(one);
		System.out.println(one.twoItems().toString());
		System.out.println(one.cheese().toString());
		FileWriter filew = new FileWriter(new File("H:\\workspace2021\\Maps\\src\\RestaurantMenu\\MenuOnlyCheese.txt"));
		filew.write(one.cheese().toString());
		filew.close();
	}

}
