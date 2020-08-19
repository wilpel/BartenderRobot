package com.williampeltomaki.core.cocktails;

import java.util.List;

public interface Cocktail {

	List<LiquorType> getIngredients();
	CocktailType getType();
	
}
