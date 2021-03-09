package se.lexicon.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa.entity.Ingredient;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient,Integer> {

  List<Ingredient> searchByName(String ingredientName);

}
