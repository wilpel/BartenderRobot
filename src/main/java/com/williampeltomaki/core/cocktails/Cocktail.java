package com.williampeltomaki.core.cocktails;

import java.util.Map;

public interface Cocktail {

	Map<LiquorType, Integer> getIngredients();
	CocktailType getType();
	String getName();
	String getImage();
	
}
