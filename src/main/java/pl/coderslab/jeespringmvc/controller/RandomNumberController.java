package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomNumberController {

    @GetMapping("/random/{min}/{max}")
    @ResponseBody
    public String generateRandom(@PathVariable int min, @PathVariable int max) {
        Random random = new Random();
        int rand = random.nextInt(max - min) + min;
        return "Wylosowano: " + rand;
    }

    @GetMapping("/toupper")
    @ResponseBody
    public String toUpper(@RequestParam String string) {
        return string.toUpperCase();
    }
}
