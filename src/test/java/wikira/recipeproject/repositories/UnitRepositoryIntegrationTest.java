package wikira.recipeproject.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import wikira.recipeproject.domain.UnitOfMeasure;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitRepositoryIntegrationTest {

    @Autowired
    UnitRepository unitRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByUnit() {
        Optional<UnitOfMeasure> uomOptional = unitRepository.findByUnit("Teaspoon");

        assertEquals("Teaspoon", uomOptional.get().getUnit());
    }

    @Test
    public void findByUnitCup() {
        Optional<UnitOfMeasure> uomOptional = unitRepository.findByUnit("Cup");

        assertEquals("Cup", uomOptional.get().getUnit());
    }
}