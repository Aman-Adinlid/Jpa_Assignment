package se.lexicon.jpa.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RecipeTest {
    Recipe recipe;


    @BeforeEach
    public void setup() {
        RecipeInstruction instruction = new RecipeInstruction();
        recipe = new Recipe();


    }

    @Test
    @DisplayName("Test1 create recipe")
    public void test1() {
        Assertions.assertEquals(1, recipe.getRecipeId());
        Assertions.assertEquals("rice", recipe.getRecipeName());

    }
}

