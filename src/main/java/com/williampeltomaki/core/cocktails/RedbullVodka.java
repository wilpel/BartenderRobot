package com.williampeltomaki.core.cocktails;

import java.util.List;

public class RedbullVodka implements Cocktail {

	@Override
	public List<LiquorType> getIngredients() {
		return List.of(LiquorType.RED_BULL, LiquorType.VODKA);
	}

	@Override
	public CocktailType getType() {
		return CocktailType.REDBULL_VODKA;
	}

}
