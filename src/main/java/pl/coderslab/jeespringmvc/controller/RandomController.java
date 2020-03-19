package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @GetMapping("/random")
    @ResponseBody
    public String showRandom() {
        Random random = new Random();
        return "Wylosowano liczbę: " + (random.nextInt(100) + 1);
    }

}
