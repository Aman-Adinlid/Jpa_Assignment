package se.lexicon.jpa.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RecipeIngredientTest {

    RecipeIngredient recipeIngredient;
    Ingredient ingredient;
    UUID testUUID;


    @BeforeEach
    public void setup() {
        ingredient = new Ingredient(1, "Potato");
        recipeIngredient = new RecipeIngredient();
        recipeIngredient.setRecipeIngredientId(testUUID);
        recipeIngredient.setAmount(2.3);
        recipeIngredient.setIngredient(ingredient);
        recipeIngredient.setMeasurement(Measurement.ML);
        recipeIngredient.setRecipe(null);
    }

    @Test
    @DisplayName("Test1: create recipeIngredient")
    public void test1() {
        assertEquals(testUUID, recipeIngredient.getRecipeIngredientId());
        assertEquals(1, recipeIngredient.getIngredient().getIngredientId());
        assertEquals(2.3, recipeIngredient.getAmount());
        assertEquals("Potato", recipeIngredient.getIngredient().getIngredientName());
        assertEquals(Measurement.ML, recipeIngredient.getMeasurement());
        assertEquals(ingredient, recipeIngredient.getIngredient());
        assertEquals(null, recipeIngredient.getRecipe());
    }

    @Test
    @DisplayName("Test2: Test Equals")
    public void test2() {
        RecipeIngredient expected = new RecipeIngredient(testUUID, ingredient, 2.3, Measurement.ML, null);
        RecipeIngredient actual = recipeIngredient;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test3: Test hashCode")
    public void test3() {
        RecipeIngredient expected = new RecipeIngredient(testUUID, ingredient, 2.3, Measurement.ML, null);
        RecipeIngredient actual = recipeIngredient;
        Assertions.assertEquals(expected.hashCode(), actual.hashCode());

    }


}
