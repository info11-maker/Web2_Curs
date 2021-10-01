package com.example.ex_http;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@RestController
public class CookiesController {
    private static final String COOKIE = "myCookie";

    @GetMapping("/cookies")
    public String addCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie(COOKIE, "Cookie");
        response.addCookie(cookie);
        return "cookie added successfully!";
    }
    @GetMapping("/cookies/value")
    public String addCookie(HttpServletRequest request, @CookieValue(name
            = COOKIE, required = false) String cookieValue) {
        return "My cookie value is:" + Objects.toString(cookieValue);
    }
    @GetMapping("/cookies/header")
    public String method2(HttpServletRequest httpServletRequest) {
        return "metoda afișeaza lista de antete cerere: " + httpServletRequest.getHeader("headers");
    }
    @GetMapping("/cookies/headerNames")
    public String method3(HttpServletRequest httpServletRequest) {
        return "metoda afișeaza lista de parametri din query string.: " + httpServletRequest.getHeaderNames().toString();
    }

}
