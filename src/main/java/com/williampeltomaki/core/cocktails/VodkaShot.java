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

}
