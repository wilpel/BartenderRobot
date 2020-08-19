package com.williampeltomaki.core.cocktails;

import java.util.Map;

public class RumAndCoke implements Cocktail{

	@Override
	public Map<LiquorType, Integer> getIngredients() {
		return Map.of(LiquorType.COKE, 3, LiquorType.RUM, 1);
	}

	@Override
	public CocktailType getType() {
		return CocktailType.RUM_AND_COKE;
	}

}
