package com.williampeltomaki.core.cocktails;

import java.util.List;

public class Mojito implements Cocktail{

	@Override
	public List<LiquorType> getIngredients() {
		return List.of(LiquorType.RUM, LiquorType.MOJITO_JUICE);
	}

	@Override
	public CocktailType getType() {
		return CocktailType.MOJITO;
	}

}
