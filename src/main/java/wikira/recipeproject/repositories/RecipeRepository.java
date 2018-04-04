package wikira.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import wikira.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
