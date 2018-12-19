package com.example.demo.interfaces;

import io.vavr.collection.List;
import io.vavr.collection.Set;
import io.vavr.collection.TreeSet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/persons/")
public class DummyController {

    @GetMapping("abc")
    public List<String> getAllString() {
//        return asList("a", "b");
        return List.of("a", "b", "c");
    }

    @GetMapping("tuple")
    public List<Set<String>> getTuple() {
        return List.of(TreeSet.of("a", "c"));
    }
}
