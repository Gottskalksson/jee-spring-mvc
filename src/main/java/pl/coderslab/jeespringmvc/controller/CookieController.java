package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @GetMapping("/setcookies/{value1}/{value2}")
    @ResponseBody
    public String setCookie(HttpServletResponse response, @PathVariable String value1, @PathVariable String value2) {
        Cookie cookie1 = new Cookie("cookie1", value1);
        Cookie cookie2 = new Cookie("cookie2", value2);
        cookie1.setPath("/");
        cookie2.setPath("/");
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        return "setCookies";
    }

    @RequestMapping("/getcookies")
    @ResponseBody
    public String getCookies(HttpServletRequest request,
                             @CookieValue("cookie1") String value1,
                             @CookieValue("cookie2") String value2) {

        Cookie cWeb1 = WebUtils.getCookie(request, "cookie1");
        Cookie cWeb2 = WebUtils.getCookie(request, "cookie2");
        String cCookieVal1 = "Cookie1: " + value1;
        String cCookieVal2 = "Cookie2: " + value2;

        return "Klasa WebUtils: \n" +
                "Cookie1: " + cWeb1.getValue() + "\n" +
                "Cookie2: " + cWeb2.getValue() + "\n" +
                "\n Adnotacja CookieValue: \n" +
                cCookieVal1 + "\n" +
                cCookieVal2;
    }

}
