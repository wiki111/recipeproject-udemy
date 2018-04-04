package wikira.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import wikira.recipeproject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitRepository extends CrudRepository<UnitOfMeasure, Long>{

    Optional<UnitOfMeasure> findByUnit(String unit);

}
