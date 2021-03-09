package se.lexicon.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa.entity.RecipeInstruction;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction, Integer> {

}
