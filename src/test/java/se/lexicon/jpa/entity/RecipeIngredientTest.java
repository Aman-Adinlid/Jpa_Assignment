package se.lexicon.jpa.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RecipeIngredientTest {

    RecipeIngredient recipeIngredient;
    Ingredient ingredient;
    Recipe recipe;

    @BeforeEach
    public void setup() {
        recipeIngredient = new RecipeIngredient(new Ingredient(3, "sugar"));
        recipe = new Recipe("cake");
        ingredient = new Ingredient("sugar");
        recipeIngredient = new RecipeIngredient(ingredient, recipe);

    }

    @Test
    @DisplayName("Test1: create recipeIngredient")
    public void test1() {
        Assertions.assertEquals(ingredient, recipeIngredient.getIngredient());

    }

    @Test
    @DisplayName("Test2: Test Equals")
    public void test2() {
        RecipeIngredient expected = new RecipeIngredient(new Ingredient("sugar"));
        Assertions.assertFalse(recipeIngredient.equals(expected));

    }

    @Test
    @DisplayName("Test3: Test hashCode")
    public void test3() {
        RecipeIngredient expected = new RecipeIngredient(new Ingredient("sugar"));


    }


}
