package se.lexicon.jpa.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import se.lexicon.jpa.entity.Ingredient;


import java.util.List;

//it is not working
@DataJpaTest
public class IngredientRepositoryTest {
    @Autowired
    IngredientRepository testObject;
    Ingredient ingredient;


    @BeforeEach
    public void setup() {
        ingredient = new Ingredient(1, "sugar");
        testObject.save(ingredient);
    }

    @Test
    @DisplayName("Test1: find Ingredient By Ingredient")
    public void test1() {
        List<Ingredient> ingredients = testObject.findIngredientByIngredient("sugar");
        ingredients.forEach(System.out::println);

    }

}
