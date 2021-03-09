package se.lexicon.jpa.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class RecipeCategoryTest {
    RecipeCategory recipeCategory;
    List<Recipe> recipes;


    @BeforeEach
    void setUp() {

        recipeCategory = new RecipeCategory(1, "food", null);
        recipeCategory.setCategoryId(1);
        recipeCategory.setCategory("food");
        recipes = new ArrayList<>();
        recipeCategory.setRecipes(recipes);
    }

    @Test
    @DisplayName("Test1: create RecipeCategory ")
    public void test1() {
        Assertions.assertEquals(1, recipeCategory.getCategoryId());
        Assertions.assertEquals("food", recipeCategory.getCategory());
    }

    @Test
    @DisplayName("Test2: Test Equals")
    public void test2() {
        RecipeCategory expected = new RecipeCategory(1, "food", recipes);
        RecipeCategory actual = recipeCategory;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test3: Test hashCode")
    public void test3() {
        RecipeCategory expected = new RecipeCategory(1, "food", recipes);
        RecipeCategory actual = recipeCategory;
        Assertions.assertEquals(expected.hashCode(), actual.hashCode());

    }
}
