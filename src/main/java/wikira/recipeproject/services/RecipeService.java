package wikira.recipeproject.services;

import org.springframework.data.repository.CrudRepository;
import wikira.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService{
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
