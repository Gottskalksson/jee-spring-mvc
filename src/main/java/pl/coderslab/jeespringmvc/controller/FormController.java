package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController {

    @GetMapping("/form")
    public String viewForm() {
        return "form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String viewResult(@RequestParam(name="paramName") String paramName) {
        return paramName;
    }
}
