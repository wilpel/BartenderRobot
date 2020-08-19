package com.williampeltomaki.core.cocktails;

import java.util.List;

public class RumAndCoke implements Cocktail{

	@Override
	public List<LiquorType> getIngredients() {
		return List.of(LiquorType.COKE, LiquorType.RUM);
	}

	@Override
	public CocktailType getType() {
		return CocktailType.RUM_AND_COKE;
	}

}
