package com.example.demo.interfaces;

import io.vavr.collection.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/persons/")
public class DummyController {

    @GetMapping("abc")
    public List<String> getAllString() {
//        return asList("a", "b");
        return List.of("a", "b", "c");
    }

}
