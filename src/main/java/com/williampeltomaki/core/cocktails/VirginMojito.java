package com.williampeltomaki.core.cocktails;

import java.util.Map;

public class VirginMojito implements Cocktail{

	@Override
	public Map<LiquorType, Integer> getIngredients() {
		return Map.of(LiquorType.WATER, 14, LiquorType.MOJITO_JUICE, 3);
	}

	@Override
	public CocktailType getType() {
		return CocktailType.VIRGIN_MOJITO;
	}

	@Override
	public String getName() {
		return "Alkoholfri Mojito";
	}

	@Override
	public String getImage() {
		return "https://www.sustainablecooks.com/wp-content/uploads/2018/06/Classic-Virgin-Mojito-Recipe-2.jpg";
	}

}
