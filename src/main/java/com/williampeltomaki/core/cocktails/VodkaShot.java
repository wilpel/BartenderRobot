package com.williampeltomaki.core.cocktails;

import java.util.List;

public class VodkaShot implements Cocktail{

	@Override
	public List<LiquorType> getIngredients() {
		return List.of(LiquorType.VODKA);
	}

	@Override
	public CocktailType getType() {
		return CocktailType.VODKA_SHOT;
	}

}
