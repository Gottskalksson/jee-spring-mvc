package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        LocalTime now = LocalTime.of(8, 30);
        String color = null;
        String bgColor = null;

        if(now.isAfter(LocalTime.of(8, 0)) && now.isBefore(LocalTime.of(22, 0))) {
            color = "#000000";
            bgColor = "#ffffff";
        } else {
            color = "#ffffff";
            bgColor = "#000000";
        }
        model.addAttribute("color", color);
        model.addAttribute("bgcolor", bgColor);
        return "home";
    }
}