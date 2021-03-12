package se.lexicon.jpa.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

public class RecipeTest {
    Recipe testObject;
    List<RecipeCategory> recipeCategories;

    @BeforeEach
    public void setup() {
        testObject = new Recipe(1, "Cake");
        testObject = new Recipe(2, "IceCream", recipeCategories);


    }

    @Test
    @DisplayName("Test1: create recipe")
    public void test1() {
        Assertions.assertEquals(2, testObject.getRecipeId());
        Assertions.assertEquals("IceCream", testObject.getRecipeName());
    }

    @Test
    @DisplayName("Test2: test equal")
    public void test2() {
        Recipe expected = new Recipe(2, "IceCream");
        Recipe actual = testObject;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test 3: test hashcode Ingredient")
    public void test_hashCode() {
        Recipe expected = new Recipe(2, "IceCream");
        Recipe actual = testObject;
        Assertions.assertEquals(expected.hashCode(), actual.hashCode());
    }
}


