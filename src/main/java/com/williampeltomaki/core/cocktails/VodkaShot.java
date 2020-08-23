package com.williampeltomaki.core.cocktails;

import java.util.Map;

public class VodkaShot implements Cocktail{

	@Override
	public Map<LiquorType, Integer> getIngredients() {
		return Map.of(LiquorType.VODKA, 1);
	}

	@Override
	public CocktailType getType() {
		return CocktailType.VODKA_SHOT;
	}

	@Override
	public String getName() {
		return "Vodka Shot";
	}

	@Override
	public String getImage() {
		return "https://images.absolutdrinks.com/drink-images/Raw/Absolut/44b6f944-4902-4b51-9f88-cef9ac20db34.jpg?imwidth=500";
	}

}
