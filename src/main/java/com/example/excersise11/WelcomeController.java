package com.example.excersise11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WelcomeController {
    @GetMapping("/name1")
    public String name() {
        return "My name is Fatimah Alabdi";

    }
    @GetMapping("/age")
    public String hello() {
        return "my age is 25";
    }
    @GetMapping("/check")
    public String CheckStatus() {
        return "Everything is fine";
    }
@GetMapping("/health")
    public String health() {
        return "Server health is up and running";
}
@GetMapping("/names")
public ArrayList<String>names(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Fatimah");
        names.add("Nora");
        names.add("Abdullah");
        return names;
}
}
