package com.williampeltomaki.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import com.williampeltomaki.core.cocktails.Cocktail;
import com.williampeltomaki.core.cocktails.CocktailType;
import com.williampeltomaki.core.cocktails.LiquorType;
import com.williampeltomaki.core.cocktails.Mojito;
import com.williampeltomaki.core.cocktails.RedbullVodka;
import com.williampeltomaki.core.cocktails.RumAndCoke;
import com.williampeltomaki.core.cocktails.VodkaShot;

public class CocktailService {

	private static List<Cocktail> cocktails = List.of(
			new RumAndCoke(),
			new Mojito(),
			new VodkaShot(),
			new RedbullVodka());
	
	private HashMap<String, LiquorType> liquorStore = new HashMap<>();
	
	public void makeCocktail() {
		try {
		String command = "python run.py 11 5";
		Process p = Runtime.getRuntime().exec(command);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<CocktailType> getAvailableCocktails() {
		List<CocktailType> availableCocktails = new ArrayList<CocktailType>();
		loadCocktailProperties();
		
		cocktails.forEach((cocktail) -> {
			
			if(canMakeCocktail(cocktail)) {
				availableCocktails.add(cocktail.getType());
			}
			
		});
		
		return availableCocktails;
	}
	
	private boolean canMakeCocktail(Cocktail cocktail) {
		for(LiquorType c : cocktail.getIngredients()) {
			if(!liquorStore.values().contains(c)) {
				return false;
			}
		}
		
		return true;
	}

	public void storeCocktailProperties(HashMap<String, LiquorType> liquorTypes) {
		try (OutputStream output = new FileOutputStream("config.properties")) {

			Properties prop = new Properties();

			liquorTypes.entrySet().forEach((liquorType) -> {
				prop.put(liquorType.getKey(), liquorType.getValue().toString());
			});

			prop.store(output, null);

			System.out.println(prop);

		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	private void loadCocktailProperties() {
		try (InputStream input = new FileInputStream("config.properties")) {

			Properties prop = new Properties();

			prop.load(input);

			System.out.println(prop.getProperty("1"));
			System.out.println(prop.getProperty("2"));
			System.out.println(prop.getProperty("3"));
			System.out.println(prop.getProperty("4"));
			
			liquorStore.put("1", LiquorType.valueOf(prop.getProperty("1")));
			liquorStore.put("2", LiquorType.valueOf(prop.getProperty("2")));
			liquorStore.put("3", LiquorType.valueOf(prop.getProperty("3")));
			liquorStore.put("4", LiquorType.valueOf(prop.getProperty("4")));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
