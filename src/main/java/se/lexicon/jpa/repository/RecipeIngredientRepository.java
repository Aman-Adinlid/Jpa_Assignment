package se.lexicon.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa.entity.RecipeIngredient;

public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient,Integer> {

}
