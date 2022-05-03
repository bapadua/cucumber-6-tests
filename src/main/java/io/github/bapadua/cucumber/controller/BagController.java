package io.github.bapadua.cucumber.controller;

import io.github.bapadua.cucumber.domain.Bag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/things")
public class BagController {

    private final Bag bag = new Bag();

    @GetMapping
    public ResponseEntity<Bag> getBag() {
        return ResponseEntity.ok(bag);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addThing(@RequestBody final String something) {
        bag.add(something);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void clear() {
        bag.removeEverything();
    }
}
