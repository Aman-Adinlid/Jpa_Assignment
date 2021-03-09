package se.lexicon.jpa.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IngredientTest {

    Ingredient ingredient;

    @BeforeEach
    public void setup() {
        ingredient = new Ingredient(1, "Potato");

    }

    @Test
    @DisplayName("Test1 create ingredient")
    public void test1() {
        Assertions.assertEquals(1, ingredient.getIngredientId());
        Assertions.assertEquals("Potato", ingredient.getIngredientName());
    }

    @Test
    @DisplayName("Test 2: test equal method")
    public void test2() {
        Ingredient expected = new Ingredient(1, "Potato");
        Ingredient actual = ingredient;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test 3: test hashcode Ingredient")
    public void test_hashCode() {
        Ingredient expected = new Ingredient(1, "Potato");
        Ingredient actual = ingredient;
        Assertions.assertEquals(expected.hashCode(), actual.hashCode());
    }
}
