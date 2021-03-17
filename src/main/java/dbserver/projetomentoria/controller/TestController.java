package dbserver.projetomentoria.controller;

import dbserver.projetomentoria.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {
    private ArrayList<Person> personArrayList = new ArrayList<>();

    @GetMapping("/testGet")
    public ResponseEntity<String> get(){
        return new ResponseEntity<>("Get Recebido!", HttpStatus.OK);
    }

    @PostMapping("/pessoa")
    public ResponseEntity<?> post(@RequestBody Person person){
        personArrayList.add(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
}
