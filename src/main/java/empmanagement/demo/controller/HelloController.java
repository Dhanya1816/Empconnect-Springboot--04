package empmanagement.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "✅ Spring Boot + MySQL connected successfully!";
    }

    @GetMapping("/test")
    public String test() {
        return "🚀 Test endpoint is working fine!";
    }
}
