package se.lexicon.jpa.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RecipeInstructionTest {
    RecipeInstruction instruction;

    @BeforeEach
    void setUp() {

        instruction = new RecipeInstruction("1", "Test");
        instruction.setRecipeInstructionId("1");
        instruction.setInstructions("test");

    }

    @Test
    @DisplayName("Test1: create RecipeInstruction ")
    public void test1() {
        Assertions.assertEquals("1", instruction.getRecipeInstructionId());
        Assertions.assertEquals("test", instruction.getInstructions());
    }

    @Test
    @DisplayName("Test2: Test Equals")
    public void test2() {
        RecipeInstruction expected = new RecipeInstruction("1", "test");
        RecipeInstruction actual = instruction;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test3: Test hashCode")
    public void test3() {
        RecipeInstruction expected = new RecipeInstruction("1", "test");
        RecipeInstruction actual = instruction;
        Assertions.assertEquals(expected.hashCode(), actual.hashCode());

    }

}
