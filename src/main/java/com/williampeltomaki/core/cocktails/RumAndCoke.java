package com.williampeltomaki.core.cocktails;

import java.util.Map;

public class RumAndCoke implements Cocktail{

	@Override
	public Map<LiquorType, Integer> getIngredients() {
		return Map.of(LiquorType.COKE, 3, LiquorType.RUM, 1);
	}

	@Override
	public CocktailType getType() {
		return CocktailType.RUM_AND_COKE;
	}

	@Override
	public String getName() {
		return "Rom och Cola";
	}

	@Override
	public String getImage() {
		return "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/delish-190904-rum-and-coke-0345-landscape-pf-1568846706.jpg";
	}

}
