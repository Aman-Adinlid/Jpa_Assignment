package se.lexicon.jpa.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class RecipeInstruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String recipeInstructionId;
    @Column(nullable = false, length = 255)
    private String instructions;

    public RecipeInstruction() {
    }

    public RecipeInstruction(String recipeInstructionId, String instructions) {
        this.recipeInstructionId = recipeInstructionId;
        this.instructions = instructions;
    }

    public String getRecipeInstructionId() {
        return recipeInstructionId;
    }

    public void setRecipeInstructionId(String recipeInstructionId) {
        this.recipeInstructionId = recipeInstructionId;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return Objects.equals(recipeInstructionId, that.recipeInstructionId) && Objects.equals(instructions, that.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeInstructionId, instructions);
    }
}
