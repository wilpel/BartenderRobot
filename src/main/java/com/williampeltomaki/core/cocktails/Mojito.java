package com.williampeltomaki.core.cocktails;

import java.util.Map;

public class Mojito implements Cocktail{

	@Override
	public Map<LiquorType, Integer> getIngredients() {
		return Map.of(LiquorType.RUM, 1, LiquorType.MOJITO_JUICE, 4);
	}

	@Override
	public CocktailType getType() {
		return CocktailType.MOJITO;
	}

}
