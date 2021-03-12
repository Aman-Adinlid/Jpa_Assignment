package se.lexicon.jpa.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpa.entity.Ingredient;
import se.lexicon.jpa.entity.Recipe;
import se.lexicon.jpa.entity.RecipeIngredient;

import java.util.List;
//it is not working
@DataJpaTest
public class RecipeRepositoryTest {
    @Autowired

    RecipeRepository testObject;
    Recipe recipe;
    Ingredient ingredient;
    RecipeIngredient recipeIngredient;

    @BeforeEach
    public void setup() {
        recipe = new Recipe("Rice");
        ingredient = new Ingredient("salt");
        recipeIngredient = new RecipeIngredient(ingredient, recipe);
        testObject.save(recipe);
    }

    @Test
    @DisplayName("Test1: find By id")
    public void test1() {
        Assertions.assertEquals(1, testObject.findById(1).get().getRecipeId());
    }

    @Test
    @DisplayName("Test2: find By Recipe Name Containing")
    public void test2() {
        List<Recipe> recipes = testObject.findRecipeByRecipeName("Rice");
        Assertions.assertEquals(1, recipes.size());
    }

}
