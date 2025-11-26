package empmanagement.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import empmanagement.demo.model.User;
import empmanagement.demo.service.UserService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody User user) {
        if (userService.checkUsernameExists(user.getEmail())) {
            return "EXISTS";
        }
        userService.createUser(user);
        return "SUCCESS";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        if (userService.validateUser(user.getEmail(), user.getPassword())) {
            return "SUCCESS";
        }
        return "FAIL";
    }
}
