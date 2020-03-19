package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Controller
public class FreeTimeController {

    @GetMapping("/freeTime")
    @ResponseBody
    public String freeTime() {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2020, 3, 16, 10, 46, 00);

        DayOfWeek dayOfWeek = now.getDayOfWeek();

        LocalTime localTime = now.toLocalTime();
        boolean after = localTime.isAfter(LocalTime.of(17, 00));
        boolean before = localTime.isBefore(LocalTime.of(9, 00));

        if (dayOfWeek == DayOfWeek.SUNDAY || dayOfWeek == DayOfWeek.SATURDAY) {
            return "Wolne!";
        } else if (after || before) {
            return "Po pracy!";
        } else {
            return "Pracuję, nie dzwoń!";
        }
    }
}
