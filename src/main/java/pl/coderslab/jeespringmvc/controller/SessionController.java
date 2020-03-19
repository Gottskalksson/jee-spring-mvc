package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDateTime;

@Controller
@SessionAttributes("loginStart")
public class SessionController {

    @GetMapping("/testSession")
    public String testSession(Model model) {

        model.addAttribute("loginStart", LocalDateTime.now());

        return "testSession";
    }

    @GetMapping("/testSession2")
    public String testSession2() {
        return "testSession";
    }
}
