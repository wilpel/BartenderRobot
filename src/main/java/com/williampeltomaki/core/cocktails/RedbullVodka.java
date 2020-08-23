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

	@Override
	public String getName() {
		return "Redbull Vodka";
	}

	@Override
	public String getImage() {
		return "https://www.liquor.com/thmb/Z6ySskyYQ86fu6nGU9bWin2wFEA=/720x540/smart/filters:no_upscale()/__opt__aboutcom__coeus__resources__content_migration__liquor__2016__12__22114511__vodka-red-bull-720x720-recipe-b16a667ca354445799610e39be61e40a.jpg";
	}

}
