package com.kalinga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String home() {
<<<<<<< HEAD
        return "<h1>Hello Kalinga V5 🚀</h1>";
=======
        return "<h1>Hello Kalinga V4 🚀</h1>";
>>>>>>> e4f54a1dd481a4271e8d480994131fd40025cad5
    }
}
