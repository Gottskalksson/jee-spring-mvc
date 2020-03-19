package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String getName(@PathVariable String firstName, @PathVariable String lastName) {
        return "Witaj " + firstName + " " + lastName + "!";
    }
}
