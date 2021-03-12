package se.lexicon.jpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import se.lexicon.jpa.entity.Recipe;
import se.lexicon.jpa.entity.RecipeCategory;
import se.lexicon.jpa.entity.RecipeIngredient;

import java.util.List;


public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

    @Query("select a from Recipe a where a.recipeName like '%recipeName%'")
    List<Recipe> findRecipeByRecipeName (@Param("recipeName") String recipeName);

    @Query("select a from RecipeIngredient a where a.ingredient = :ingredient")
    List<RecipeIngredient> searchAllRecipeByIngredientQuery(@Param("ingredient") String ingredient);

    @Query("select a from RecipeCategory a where a.category = :categoryName")
    List<RecipeCategory> searchAllRecipeByCategoryQuery(@Param("categoryName") String categoryName);

}
