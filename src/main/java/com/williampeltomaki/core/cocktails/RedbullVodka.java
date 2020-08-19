package com.williampeltomaki.core.cocktails;

import java.util.Map;

public class RedbullVodka implements Cocktail {

	@Override
	public Map<LiquorType, Integer> getIngredients() {
		return Map.of(LiquorType.RED_BULL, 4, LiquorType.VODKA, 1);
	}

	@Override
	public CocktailType getType() {
		return CocktailType.REDBULL_VODKA;
	}

}
