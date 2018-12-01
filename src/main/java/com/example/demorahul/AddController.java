package com.example.demorahul;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class AddController {

    private final AddService addService;

    public AddController(AddService addService) {
        this.addService = addService;
    }

    @GetMapping("/{a}/{b}")
    public ResponseEntity<Result> add(@PathVariable Integer a,@PathVariable Integer b) {
        return ResponseEntity.ok(this.addService.add(a,b));
    }
}
