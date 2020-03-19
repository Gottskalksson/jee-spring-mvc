package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplyController {

    @RequestMapping("/multiply")
    public String multiply(Model model, @RequestParam(defaultValue = "10") String size) {
        model.addAttribute("size", size);
        return "multiply";
    }

    @GetMapping("multiply/{rows}/{cols}")
    public String multiply(Model model, @PathVariable String rows, @PathVariable String cols) {
        model.addAttribute("rows", rows);
        model.addAttribute("cols", cols);
        return "multiply2";
    }
}
