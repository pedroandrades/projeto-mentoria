package dbserver.projetomentoria.controller;

import dbserver.projetomentoria.model.Cars;
import dbserver.projetomentoria.model.Categories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/v1/cars")
public class CarsController {

    private ArrayList<Cars> carsArrayList = new ArrayList<>();
    private ArrayList<Categories> categoriesArrayList = new ArrayList<>();

    @GetMapping
    public ResponseEntity<ArrayList<Cars>> list(){
        populateCategoriesList();
        addCategoryToCar();
        return new ResponseEntity<>(carsArrayList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cars> create(@RequestBody Cars cars){
        carsArrayList.add(cars);
        return new ResponseEntity<>(cars, HttpStatus.CREATED);
    }

    private void populateCategoriesList() {
        if(categoriesArrayList.isEmpty()) {
            Categories subcompacto = new Categories(1L, "Subcompacto",
                    "Automóvel subcompacto", LocalDateTime.now());

            Categories suv = new Categories(2L, "SUV",
                    "Automóvel SUV", LocalDateTime.now());
            categoriesArrayList.add(subcompacto);
            categoriesArrayList.add(suv);
        }
    }

    private void addCategoryToCar(){
        for(Cars cars : carsArrayList){
            Long id = cars.getCategoriesId();
            Optional<Categories> categoryOptional =
                    categoriesArrayList.stream().filter(c -> c.getId() == id).findFirst();
            if(categoryOptional.isPresent()){
                cars.setCategories(categoryOptional.get());
            }
        }
    }
}
