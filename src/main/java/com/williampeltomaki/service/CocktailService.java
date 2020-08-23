package com.williampeltomaki.service;

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
import com.williampeltomaki.core.cocktails.VirginMojito;
import com.williampeltomaki.core.cocktails.VodkaShot;

public class CocktailService {

	private static List<Cocktail> cocktails = List.of(
			new RumAndCoke(),
			new Mojito(),
			new VodkaShot(),
			new RedbullVodka(),
			new VirginMojito());
	
	private HashMap<LiquorType, String> liquorStore = new HashMap<>();
	
	public void makeCocktail(CocktailType cocktailType) {
		loadCocktailProperties();
		Cocktail cocktail = getCocktailByType(cocktailType);
		
		for(java.util.Map.Entry<LiquorType, Integer> entry : cocktail.getIngredients().entrySet()) {
			System.out.println(entry);
			pourLiquid(Integer.parseInt(liquorStore.get(entry.getKey())), entry.getValue());
		}
		
	}
	
	public void clean(int pump) {
		pourLiquid(pump, 40);
	}
	
	private void pourLiquid(int pumpNumber, int duration) {
		System.out.println("Pouring on pump " + pumpNumber + " for " + duration + "seconds");
		try {
			String command = "python run.py " + pumpNumber + " " + duration;
			Process p = Runtime.getRuntime().exec(command);
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public List<Cocktail> getAvailableCocktails() {
		List<Cocktail> availableCocktails = new ArrayList<Cocktail>();
		loadCocktailProperties();
		
		cocktails.forEach((cocktail) -> {
			
			if(canMakeCocktail(cocktail)) {
				availableCocktails.add(getCocktailByType(cocktail.getType()));
			}
			
		});
		
		return availableCocktails;
	}
	
	private boolean canMakeCocktail(Cocktail cocktail) {
		for(LiquorType c : cocktail.getIngredients().keySet()) {
			if(!liquorStore.keySet().contains(c)) {
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
			
			liquorStore.put(LiquorType.valueOf(prop.getProperty("1")), "1");
			liquorStore.put(LiquorType.valueOf(prop.getProperty("2")), "2");
			liquorStore.put(LiquorType.valueOf(prop.getProperty("3")), "3");
			liquorStore.put(LiquorType.valueOf(prop.getProperty("4")), "4");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private Cocktail getCocktailByType(CocktailType cocktailType) {
		for(Cocktail cocktail : cocktails) {
			if(cocktail.getType().equals(cocktailType)) return cocktail;
		}
		
		return null;
	}
}
