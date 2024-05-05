package com.example.test4.Public_Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @GetMapping("/dummy")
    public String getDummyData() {
        return "This is dummy data!";
    }
}
