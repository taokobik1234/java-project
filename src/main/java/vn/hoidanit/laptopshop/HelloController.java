package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World from VN !";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Hello World from user !";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Hello World from admin !";
    }
}
