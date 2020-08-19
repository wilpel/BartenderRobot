package com.williampeltomaki.core.rest;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.williampeltomaki.core.cocktails.CocktailType;
import com.williampeltomaki.core.cocktails.LiquorType;
import com.williampeltomaki.service.CocktailService;

@RestController()
@RequestMapping("/v1/")
public class CocktailController {

	@Autowired
	private CocktailService cocktailService;
	
	@GetMapping("/list")
	public List<CocktailType> listAvailableCocktails() {
		return cocktailService.getAvailableCocktails();
	}
	
	@PostMapping("/configure")
	public void configureLiquorStore(@RequestBody HashMap<String, LiquorType> liquorTypes) {
		cocktailService.storeCocktailProperties(liquorTypes);
	}
	
}