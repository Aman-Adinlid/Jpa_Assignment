package se.lexicon.jpa.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RecipeTest {
    Recipe recipe;
    List<RecipeIngredient> recipeIngredients;
    RecipeInstruction instruction;
    List<RecipeCategory> recipeCategory;

    @BeforeEach
    public void setup() {
        Recipe recipe = new Recipe(1, "rice", recipeIngredients, instruction, recipeCategory);
        recipe.getRecipeId();
        recipe.getRecipeName();
        recipe.getRecipeIngredients();
        recipe.getInstruction();
        recipe.getRecipeCategories();
    }

    @Test
    @DisplayName("Test1 create recipe")
    public void test1() {
        Assertions.assertEquals(1, recipe.getRecipeId());
        Assertions.assertEquals("rice", recipe.getRecipeName());

    }
}


