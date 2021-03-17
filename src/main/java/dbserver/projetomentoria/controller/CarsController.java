package dbserver.projetomentoria.controller;

import dbserver.projetomentoria.model.Cars;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1/cars")
public class CarsController {

    private ArrayList<Cars> carsArrayList = new ArrayList<>();

    @GetMapping
    public ResponseEntity<ArrayList<Cars>> list(){
        return new ResponseEntity<>(carsArrayList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cars> create(@RequestBody Cars cars){
        carsArrayList.add(cars);
        return new ResponseEntity<>(cars, HttpStatus.CREATED);
    }
}
