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

	@Override
	public String getName() {
		return "Mojito";
	}

	@Override
	public String getImage() {
		return "https://www.liquor.com/thmb/3k_URizzsvwXyQgJ1dFSyQIMbA8=/450x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__liquor__2018__09__04153106__mojito-720x720-recipe-a55b114fc99c4a64b38c9ef6d1660e20.jpg";
	}

}
