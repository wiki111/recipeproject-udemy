package wikira.recipeproject.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wikira.recipeproject.services.RecipeService;

@Slf4j
@Controller
public class IndexController {

  /*  private CategoryRepository categoryRepository;
    private UnitRepository unitRepository;

    public IndexController(CategoryRepository categoryRepository, UnitRepository unitRepository) {
        this.categoryRepository = categoryRepository;
        this.unitRepository = unitRepository;
    }
    */

  private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        log.debug("Here's Controller to Major Tom...");
        /*
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitRepository.findByUnit("Teaspoon");

        System.out.println("Cat Id is : " + categoryOptional.get().getId());
        System.out.println("Udm is : " + unitOfMeasureOptional.get().getId());
        */



        return "index";
    }

}
