package se.lexicon.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa.entity.Ingredient;
import se.lexicon.jpa.entity.Recipe;

import java.util.List;
import java.util.Locale;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

    List<Recipe> searchRecipeName(String recipeName);

    List<Recipe> searchAllRecipes(Ingredient name);

    List<Recipe> searchAllRecipes(Recipe category);
}
